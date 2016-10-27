public class ComandoBuscarPessoa implements IComando {
	private Pessoa pessoa;
	private Long id;
	
	public ComandoBuscarPessoa(Long id){
		this.id = id;
	}
	
	
	@Override
	public void execute(ICRUD crud) {
		pessoa = (Pessoa)crud.buscar(id);
	}

}

