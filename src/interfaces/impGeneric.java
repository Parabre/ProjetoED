package interfaces;

public interface impGeneric <T extends classeGenerica> {
	
	public void cadastrar(T obj);
	public T RemoveFinal();
	public T RemoveInicio();
	public T RemoveAt(int pos);
	public T AlteraAt(int pos);

	public String percorre();
	
	
}
