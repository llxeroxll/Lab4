import java.util.HashMap;


public class CRUDPessoa implements ICRUD<Long, Pessoa> {
	HashMap<Long, Pessoa> pessoas;
	 
	
	public CRUDPessoa(){
		pessoas = new HashMap<Long, Pessoa>();
	}
	
	@Override
	public void adiciona(Long id, Pessoa pessoa) {
		pessoas.put(id, pessoa); 
	}

	@Override
	public void atualiza(Long key, Pessoa newPessoa) {
		
		adiciona(key, newPessoa); //abstraindo exce��es
		
	}

	@Override
	public Pessoa buscar(Long key) {
		Pessoa p = null;
	    if (pessoas.containsKey(key)) {
	      p = pessoas.get(key);
	    } else {
	      p = new Pessoa("ERROR"); //abstraindo exce��es
	    }
	    return p;
	}

}
