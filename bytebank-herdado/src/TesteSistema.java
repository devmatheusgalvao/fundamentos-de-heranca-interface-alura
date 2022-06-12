
public class TesteSistema {

	public static void main(String[] args) {
		Gerente gteste = new Gerente();
		gteste.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(1234);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(gteste);
		si.autentica(adm);
		si.autentica(cliente);
	
		

	}

}
