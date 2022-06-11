
// n�o podemos instanciar esse classe por ela ser abstrata
public abstract class Funcionario {
	
	//primeiro, declaramos as informa��es dos funcion�rios
	private String nome;
	private String cpf;
	private double salario;
	
	
	//GETTERS AND SETTERS
	//Get de Bonifica��o de 10%
	
	// abstract no m�todo significa que o m�todo n�o tem corpo, n�o h� implementa��o
	public abstract double getBonificacao();
	
	//Demais getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
