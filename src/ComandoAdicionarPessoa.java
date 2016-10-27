public class ComandoAdicionarPessoa implements IComando {
	
	private Pessoa pessoa;
	private Long id;
	
	public ComandoAdicionarPessoa(Long id, Pessoa pessoa){
		this.id = id;
		this.pessoa = pessoa;
	}
	
	
	@Override
	public void execute(ICRUD crud) {
		crud.adiciona(id, pessoa);
		crud.setMemento(this);
	}


	@Override
	public void undo(ICRUD crud) {
		crud.deleta(id);
		crud.setMemento(null);
		
	}

}
