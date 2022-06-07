
public class TestandoGerente {

	public static void main(String[] args) {
		
		//Criando o gerente
		Gerente matheus1 = new Gerente();
		
		//Definindo os métodos herdados da classe Funcionário
		matheus1.setNome("Matheus Galvão");
		matheus1.setCpf("789.456.123-12");
		matheus1.setSalario(5200);
		
		//Testando
		System.out.println(matheus1.getNome());
		System.out.println(matheus1.getCpf());
		System.out.println(matheus1.getSalario());
		
		//Definindo e testando o método exclusivo da classe Gerente
		matheus1.setSenha(1234);
		boolean autenticar = matheus1.autentica(1234);
		System.out.println(autenticar);

	}

}
