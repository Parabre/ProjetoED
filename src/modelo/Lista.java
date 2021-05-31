package modelo;

import javax.swing.JOptionPane;
import interfaces.classeGenerica;
import interfaces.impGeneric;

public class Lista <T extends classeGenerica> implements impGeneric<T> {
	private NO<T> node;
	private int tamanho = 0;


	public Lista(){
		this.node=null;
	}


	@Override
	public void cadastrar(T obj){
		this.tamanho++;
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
			this.tamanho--;
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
			this.tamanho--;
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



	public void ordenar() {
		
		this.quicksort(this.node, 1, this.tamanho);
		
	}
	
public void quicksort(NO<T> obj, int esq, int dir) {
		
		if (esq < dir) {
			int p = particao(obj, esq, dir);
			quicksort(obj, esq, p-1);
			quicksort(obj, p + 1, dir);
			
				
		}
		
  }


public boolean compareTo(T obj, T obj2) { 
	
	if (obj instanceof clientes) {
		clientes cli = (clientes) obj;
		clientes cli2 = (clientes) obj2;
		
		if (cli.getNome().compareToIgnoreCase(cli2.getNome()) < 0)  {
			return true;
		} else {
			return false;
		}
		
	} else {
		aluguel alug = (aluguel) obj;
		aluguel alug2 = (aluguel) obj2;
		
		
	if (alug.getlugar().compareToIgnoreCase(alug.getlugar()) < 0)  {
			return true;
	} else {
		return false;
	}
		
		
		
	}
}

	

	public int particao(NO<T> obj, int esq, int dir) {
		int meio = (int) esq + dir /2;
		NO<T> pivo = this.caminhaAtePos(meio);
		int i = esq - 1;
		int j = dir + 1;
		
		while (true) {
			do {
				i++;
			} while (compareTo(this.caminhaAtePos(i).obj, pivo.obj));
			
			do {
				j--;
			} while (compareTo(pivo.obj, this.caminhaAtePos(j).obj));
			
			if (i >= j) {
				return j;
			}
			
			NO<T> aux = this.caminhaAtePos(i);
			NO<T> aux2 = this.caminhaAtePos(j);
			this.setTroca(aux, aux2);
			
			
			
		
		
			
			
			
		}
	}


	@Override
	public T AlteraAt(int pos) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public T reordenar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public NO<T> caminhaAtePos(int pos) {
	
		    NO<T> resp = null;
		    int tamanho = this.tamanho;
		

		    if(pos < 1 || pos > tamanho) {
		       System.out.print("ERRO");
		      
		    }
		    NO<T> i = this.node;
		   
		    for(int j = 1; j <= pos; j++, i = i.prox) {
		        resp = i;
		    }
		    
		    return resp;
		}
	
	
	public void setTroca (NO<T> obj1, NO<T> obj2) {
		
			T aux = obj1.obj;
			obj1.obj = obj2.obj;
			obj2.obj = aux;
		
			
		  
		}        
	   

	  
	
	
	
	


	@Override
	public T separar() {
		// TODO Auto-generated method stub
		return null;
	}

}


