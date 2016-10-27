public class ComandoAtualizarPessoa implements IComando {
	
	private Pessoa newPessoa;
	private Pessoa oldPessoa;
	private Long id;
	
	public ComandoAtualizarPessoa(Long id, Pessoa newPessoa){
		this.id = id;
		this.newPessoa = newPessoa;
	}
	
	
	@Override
	public void execute(ICRUD crud) {
		oldPessoa = (Pessoa) crud.buscar(id);
		crud.atualiza(id, newPessoa);
		crud.setMemento(this);
	}


	@Override
	public void undo(ICRUD crud) {
		crud.atualiza(id, oldPessoa);
		crud.setMemento(null);
		
	}


}
