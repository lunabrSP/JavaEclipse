import java.util.Scanner;
public class funcionario {
	public static void main (String[] args) {
		
		Scanner GetTeclado = new Scanner(System.in);
		String TxtNome, TxtEmail, TxtSalario;
		TxtNome = GetTeclado.nextLine();
		TxtEmail = GetTeclado.nextLine();
		TxtSalario = GetTeclado.nextLine();
		
		Pessoa P1 = new Pessoa(TxtNome, TxtEmail, Float.parseFloat(TxtSalario));
		
		System.out.println("\nHello Eclipse");
		System.out.println(P1.getNome());
		System.out.println(P1.getEmail() + "gmail.com");
		System.out.println(P1.getSalario());
		
		
		
	}
	
}
