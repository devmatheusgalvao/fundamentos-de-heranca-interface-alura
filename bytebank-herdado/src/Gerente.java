//Nessa classe de Gerente, nós herdamos as informações do funcionário e ele "assina" o contrato autenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
		
		private int senha;
		
		
		//GETTERS AND SETTERS
		//Get de Bonificação de salário
		
		public double getBonificacao() {
			return super.getSalario();   
			//podemos aproveitar os métodos da classe mãe usando "super"
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
