
public class TestandoFuncionario {

	public static void main(String[] args) {
		
		//Criando um funcion�rio exemplo
		Funcionario matheus = new Funcionario();
		
		//Definindo as informa��es desse exemplo
		matheus.setNome("Matheus Galv�o");
		matheus.setCpf("123.456.789-89");
		matheus.setSalario(3200);
		
		//Testando a sa�da dessas informa��es
		System.out.println(matheus.getNome());
		System.out.println(matheus.getBonificacao());		
		
	}

}
