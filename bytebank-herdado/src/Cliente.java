
public class Cliente implements Autenticavel {

	private AutenticacaoUtil util;
	
	public Cliente() {
		AutenticacaoUtil util = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.util.autentica(senha);
		return autenticou;
	}

	

}
