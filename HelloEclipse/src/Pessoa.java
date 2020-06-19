public class Pessoa {

	private String Nome;
	private String Email;
	private float Salario;
	
	public Pessoa(String nome, String email, float salario) {
		Nome = nome;
		Email = email;
		Salario = salario;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}
	
	
}


