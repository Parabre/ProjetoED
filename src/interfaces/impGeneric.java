package interfaces;

public interface impGeneric <T extends classeGenerica> {
	
	public void cadastrar(T obj);
	public T RemoveFinal(T obj);
	public T RemoveInicio(T obj);
	public String percorre();
	
	
}
