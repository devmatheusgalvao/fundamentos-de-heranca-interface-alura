
public class TestandoFuncionario {

	public static void main(String[] args) {
		
		//Criando um funcionário exemplo
		Gerente matheus = new Gerente();
		
		//Definindo as informações desse exemplo
		matheus.setNome("Matheus Galvão");
		matheus.setCpf("123.456.789-89");
		matheus.setSalario(3200);
		
		//Testando a saída dessas informações
		System.out.println(matheus.getNome());
		System.out.println(matheus.getBonificacao());		
		
	}

}
