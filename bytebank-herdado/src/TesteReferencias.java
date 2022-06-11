
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Matheus Galvão");
		g1.setSalario(5000);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setNome("Gianna de Jesus");
		ev1.setSalario(2100);
		
		Designer d1 = new Designer();
		d1.setSalario(2600);
		
		
		//quando chamamos um método que foi estabelecido utilizando a referência Funcionário, o método do objeto que é chamado
		ControleBonifica controle = new ControleBonifica();
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
		
		
		
	}

}
