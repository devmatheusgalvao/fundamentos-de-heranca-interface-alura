//Nessa classe de Gerente, n�s herdamos as informa��es do funcion�rio e ele "assina" o contrato autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
		
		private int senha;
		
		
		//GETTERS AND SETTERS
		//Get de Bonifica��o de sal�rio
		
		public double getBonificacao() {
			return super.getSalario();   
			//podemos aproveitar os m�todos da classe m�e usando "super"
		}

		@Override
		public void setSenha(int senha) {
			this.senha = senha;				
		}

		@Override
		public boolean autentica(int senha) {
			if (this.senha == senha) {
				return true;
			} else {
				return false;
			}
		}
		
}
