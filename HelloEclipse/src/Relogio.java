
public class Relogio {

	private int Hora;
	private int Minuto;
	private int Segundo;

	public Relogio(int hora, int minuto, int segundo) {
		Hora = hora;
		Minuto = minuto;
		Segundo = segundo;
	}

	public int getHora() {
		return Hora;
	}

	public void setHora(int hora) {
		Hora = hora;
	}

	public int getMinuto() {
		return Minuto;
	}

	public void setMinuto(int minuto) {
		Minuto = minuto;
	}

	public int getSegundo() {
		return Segundo;
	}

	public void setSegundo(int segundo) {
		Segundo = segundo;
	}

	public void SetTime(int Hora, int Minuto, int Segundo) {

		if (Hora > 24 || Minuto > 59 || Segundo > 59) {
			return;
		} else {
			setHora(Hora);
			setMinuto(Minuto);
			setSegundo(Segundo);
		}
	}

	public String DisplayDefault() {

		String MSG = "";
		int HoraN = 0;

		if (Hora < 12) {

			MSG = Hora + ":" + Minuto + ":" + Segundo + "AM";

		} else if (Hora >= 12) {

			switch (Hora) {
			case 13:
				HoraN = 1;
				break;
			case 14:
				HoraN = 2;
				break;
			case 15:
				HoraN = 3;
				break;
			case 16:
				HoraN = 4;
				break;
			case 17:
				HoraN = 5;
				break;
			case 18:
				HoraN = 6;
				break;
			case 19:
				HoraN = 7;
				break;
			case 20:
				HoraN = 8;
				break;
			case 21:
				HoraN = 9;
				break;
			case 22:
				HoraN = 10;
				break;
			case 23:
				HoraN = 11;
				break;
			case 24:
				if (Minuto > 1 || Segundo > 1) {
					HoraN = 0;
				} else {
					HoraN = 24;
				}

				break;

			default:
				break;
			}

			if (HoraN == 0) {

				MSG = (HoraN) + ":" + Minuto + ":" + Segundo + "AM";

			} else {

				MSG = (HoraN) + ":" + Minuto + ":" + Segundo + "PM";

			}
		}

		return MSG;
	}

	public String DisplayUniversal() {

		int HoraN = 0;

		if (Hora == 24 && (Minuto > 0 || Segundo > 0)) {

			return (0 + ":" + Minuto + ":" + Segundo);

		}

		else {

			return (Hora + ":" + Minuto + ":" + Segundo);
		}
	}
}
