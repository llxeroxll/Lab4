public interface ICRUD<KEY, OBJETO, MEMENTO> {
	
	public void setMemento(MEMENTO m);
	public void adiciona(KEY key, OBJETO obj);
	public void deleta(KEY key);
	public void atualiza(KEY key, OBJETO newObj);
	public OBJETO buscar(KEY key);
	public void undo();
	
}
