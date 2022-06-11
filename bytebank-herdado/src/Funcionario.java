
// não podemos instanciar esse classe por ela ser abstrata
public abstract class Funcionario {
	
	//primeiro, declaramos as informações dos funcionários
	private String nome;
	private String cpf;
	private double salario;
	
	
	//GETTERS AND SETTERS
	//Get de Bonificação de 10%
	
	// abstract no método significa que o método não tem corpo, não há implementação
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
