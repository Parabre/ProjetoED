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
	

	public String percorre(){
		
		NO<T> aux= this.node;
		String r=" ";
		int n = 1;
	
		
		while(aux!=null){
		
			r += "\n " + n + " - " + aux.obj.getAll();
			aux=aux.prox;
			n++;
		}
		
		return r;
	}


	@Override
	public T RemoveFinal() {
		T obj = null;
		if (this.node == null) {
			JOptionPane.showMessageDialog(null, "Lista Vázia");
		} else {
			if (this.node.prox == null) {
				obj = this.node.obj;
				this.node = null;
			} else {
				NO<T> aux1 = this.node;
				NO<T> aux2 = this.node;

				while (aux1.prox != null) {
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				obj = aux1.obj;
				aux2.prox = null;
			}
		}
		return obj;
		
	}


	@Override
	public T RemoveInicio() {
		T obj = null;
		if (this.node == null) {
			JOptionPane.showMessageDialog(null, "Lista Vázia");
		} else {
			obj = this.node.obj;
			this.node = this.node.prox;
		}
		return obj;
		
	}




	@Override
	public T RemoveAt(int pos) {
			T obj;
			int i=1;
			NO<T> aux=this.node;

			if(this.node==null){
				System.out.println("Lista Vazia!");
				return null;
			} 
			if (pos == 1) {
				obj = RemoveInicio();
				
				return obj;
			}
			         
				while(aux.prox!=null){
					aux=aux.prox;
					i++;
				}
				if(pos>i || pos==0){
					System.out.println("Posição Invalida!");
					return null;
				
				} else if(pos == i) {
					obj = RemoveFinal();
					return obj;
				} else{
				
					aux= this.node;
					NO<T> aux2=aux;

					while(pos>1){
						aux2=aux;
						aux=aux.prox;
						pos--;
					}
					obj=aux.obj;
					aux2.prox=aux.prox;	
					return obj;
				}
	}


	@Override
	public T AlteraAt(int pos) {
		// TODO Auto-generated method stub
		return null;
	}




}