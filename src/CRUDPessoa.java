import java.util.HashMap;


public class CRUDPessoa implements ICRUD<Long, Pessoa, IComando> {
	public HashMap<Long, Pessoa> pessoas; //P�blic apenas para facilitar testes, mudar para private e implementar toString
	private IComando memento;
	 
	
	public CRUDPessoa(){
		pessoas = new HashMap<Long, Pessoa>();
	}
	
	public void setMemento(IComando memento){
		this.memento = memento;
	}
	
	@Override
	public void adiciona(Long id, Pessoa pessoa) {
		pessoas.put(id, pessoa); 
	}
	
	@Override
	public void deleta(Long id){
		pessoas.remove(id);
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
	
	@Override
	public void undo(){
		
		if(memento != null){
			memento.undo(this);
		}
		
	}

}
