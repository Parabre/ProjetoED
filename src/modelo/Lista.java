package modelo;

import javax.swing.JOptionPane;
import interfaces.classeGenerica;
import interfaces.impGeneric;

public class Lista <T extends classeGenerica> implements impGeneric<T> {
	private NO<T> node;

	public Lista(){
		this.node=null;
	}


	@Override
	public void cadastrar(T obj){
		NO<T> n = new NO<T>(obj);
		n.prox = this.node;
		this.node = n;
	}
	

	public T RemoveFinal(){
		T objReturn = null;
		
		if (this.node==null){
			JOptionPane.showMessageDialog(null, "Lista Vázia");
		}
		else{
			if (this.node.prox==null){
				objReturn= this.node.obj;
				this.node= null;
			}
			else{
				NO<T> aux1=this.node;
				NO<T> aux2= null;

				while(aux1.prox!=null){
					aux2=aux1;
					aux1=aux1.prox;
				}

				objReturn =aux1.obj;
				aux2.prox=null;
			}
		}
		return objReturn;
	}




	public String percorre(){
		NO<T> aux= this.node;
		String r=" ";
		
		while(aux!=null){
		
			r += "\n "+ aux.obj.getAll();
			aux=aux.prox;
		}
		
		return r;
	}


	@Override
	public T RemoveFinal(T obj) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public T RemoveInicio(T obj) {
		// TODO Auto-generated method stub
		return null;
	}


}