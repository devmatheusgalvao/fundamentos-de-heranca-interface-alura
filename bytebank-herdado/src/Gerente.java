//Nessa classe de Gerente, nós herdamos as informações do funcionário

public class Gerente extends Funcionario {
		
		private int senha;
		
		public void setSenha(int senha) {
			this.senha = senha;
		}
		
		public boolean autentica(int senha) {
			if(this.senha == senha) {
				return true;
			} else {
				return false;
			}
		}
		
		
		//GETTERS AND SETTERS
		//Get de Bonificação de salário
		
		public double getBonificacao() {
			return super.getBonificacao() + super.getSalario();   
			//podemos aproveitar os métodos da classe mãe usando "super"
		}
		
}
