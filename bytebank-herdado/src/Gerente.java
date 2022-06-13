//Nessa classe de Gerente, n�s herdamos as informa��es do funcion�rio e ele "assina" o contrato autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
		
		private AutenticacaoUtil util;

		public Gerente() {
			this.util = new AutenticacaoUtil();
		}
		
		
		//GETTERS AND SETTERS
		//Get de Bonifica��o de sal�rio
		
		public double getBonificacao() {
			return super.getSalario();   
			//podemos aproveitar os m�todos da classe m�e usando "super"
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
