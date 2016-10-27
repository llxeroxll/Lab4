
public class Teste {
	public static void main(String[] args ){
		CRUDPessoa cp = new CRUDPessoa();
		
		ComandoAdicionarPessoa c = new ComandoAdicionarPessoa(1L, new Pessoa("Janjo"));
		c.execute(cp);
		
		for(Pessoa p: cp.pessoas.values()){
			System.out.println(p.getNome());
		}
		
		System.out.println();
		
		c = new ComandoAdicionarPessoa(2L, new Pessoa("Mameluco suave"));
		c.execute(cp);
		
		for(Pessoa p: cp.pessoas.values()){
			System.out.println(p.getNome());
		}
		
		cp.undo();
		
		System.out.println();
		
		for(Pessoa p: cp.pessoas.values()){
			System.out.println(p.getNome());
		}
		
		ComandoAtualizarPessoa c2 = new ComandoAtualizarPessoa(1L, new Pessoa("Janjo metalizado"));
		c2.execute(cp);
		
		System.out.println();
		
		for(Pessoa p: cp.pessoas.values()){
			System.out.println(p.getNome());
		}
		
		cp.undo();
		
		System.out.println();
		
		for(Pessoa p: cp.pessoas.values()){
			System.out.println(p.getNome());
		}
	}
		

}
