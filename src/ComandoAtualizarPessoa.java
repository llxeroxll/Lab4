public class ComandoAtualizarPessoa implements IComando {
	
	private Pessoa newPessoa;
	private Long id;
	
	public ComandoAtualizarPessoa(Long id, Pessoa newPessoa){
		this.id = id;
		this.newPessoa = newPessoa;
	}
	
	
	@Override
	public void execute(ICRUD crud) {
		crud.atualiza(id, newPessoa);
	}


}
