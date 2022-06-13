//Nessa classe de Gerente, nós herdamos as informações do funcionário e ele "assina" o contrato autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
		
		private AutenticacaoUtil util;

		public Gerente() {
			this.util = new AutenticacaoUtil();
		}
		
		
		//GETTERS AND SETTERS
		//Get de Bonificação de salário
		
		public double getBonificacao() {
			return super.getSalario();   
			//podemos aproveitar os métodos da classe mãe usando "super"
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
