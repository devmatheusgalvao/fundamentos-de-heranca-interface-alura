//Nessa classe de Gerente, n�s herdamos as informa��es do funcion�rio

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
		//Get de Bonifica��o de sal�rio
		
		public double getBonificacao() {
			return super.getBonificacao() + super.getSalario();   
			//podemos aproveitar os m�todos da classe m�e usando "super"
		}
		
}
