package interfaces;

import modelo.NO;

public interface impGeneric <T extends classeGenerica> {
	
	public void cadastrar(T obj);
	public T RemoveFinal();
	public T RemoveInicio();
	public T RemoveAt(int pos);
	public T AlteraAt(int pos);
	public T reordenar();
	public NO<T> caminhaAtePos(int pos);
	public T separar();

	public String percorre();
	
	
}
