
import java.util.Scanner;

public class AppUsaRelogio {

	public static void main (String[] args) {
		
		Scanner GetTeclado = new Scanner(System.in);
		
		int Hora;
		int Minuto;
		int Segundo;
		
		System.out.println("\nDigite o horario:");
		
		Hora = GetTeclado.nextInt();
		Minuto = GetTeclado.nextInt();
		Segundo = GetTeclado.nextInt();
		
		Relogio Time = new Relogio (Hora, Minuto, Segundo);
		
		System.out.println(Time.DisplayDefault());
		System.out.println(Time.DisplayUniversal());
		
		Time.SetTime(Hora + 1, Minuto + 10, Segundo + 20);
		
		System.out.println(Time.DisplayDefault());
		System.out.println(Time.DisplayUniversal());
		
	}
	
}
