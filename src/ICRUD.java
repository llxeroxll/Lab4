public interface ICRUD<KEY, OBJETO> {
	
	public void adiciona(KEY key, OBJETO obj);
	public void atualiza(KEY key, OBJETO newObj);
	public OBJETO buscar(KEY key);
	
}
