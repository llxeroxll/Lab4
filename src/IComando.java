public interface IComando {
	public void execute(ICRUD crud);
	public void undo(ICRUD crud);
}
