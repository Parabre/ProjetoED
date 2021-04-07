package modelo;

import javax.swing.JOptionPane;

public class Lista {
	private NO inicio;

	public Lista(){
		inicio=null;
	}


	public void cadastrar(clientes e){
		NO n = new NO(e);
		n.prox=inicio;
		inicio=n;
	}

	public clientes RemoveFinal(){
		clientes r = null;
		
		if (inicio==null){
			JOptionPane.showMessageDialog(null, "Lista Vázia");
		}
		else{
			if (inicio.prox==null){
				r=inicio.cliente;
				inicio=null;
			}
			else{
				NO aux1=inicio;
				NO aux2=inicio;

				while(aux1.prox!=null){
					aux2=aux1;
					aux1=aux1.prox;
				}

				r=aux1.cliente;
				aux2.prox=null;
			}
		}
		return r;
	}

	public clientes RemoveInicio(){
		clientes r = null;
		if (inicio==null){
			JOptionPane.showMessageDialog(null,"Lista Vázia");
		}
		else{
			r=inicio.cliente;
			inicio=inicio.prox;
		}
		return r;
	}



//	public clientes escolheRemove(clientes pos){
//		clientes e=-1;
//		clientes i=1;
//		NO aux=inicio;
//
//		if(inicio==null){
//			JOptionPane.showMessageDialog(null, "Lista Vazia!");
//			return e;
//		}    
//		if(pos==1){// NOVA CONDIÇÃO. TODA VEZ QUE A POS FOR 1, O ITEM REMOVIDO SERÁ O PRIMEIRO
//			e=RemoveInicio();
//			return e;
//		}else{           
//			while(aux.prox!=null){
//				aux=aux.prox;
//				i++;
//			}
//			if(pos>i || pos<=0){
//				JOptionPane.showMessageDialog(null, "Posição Invalida!");
//				return e;
//			}else if(pos==i){
//				e=RemoveFinal();
//				return e;
//			}else{
//				aux=inicio;
//				NO aux2=aux;
//
//				while(pos>1){
//					aux2=aux;
//					aux=aux.prox;
//					pos--;
//				}
//				e=aux.dado;
//				aux2.prox=aux.prox;
//				return e;
//			}
//		}        
//	}

	public String percorre(){
		NO aux=inicio;
		String r=" ";
		
		while(aux!=null){
		
			System.out.println("Nome do cidadao: " + aux.cliente.getNome() + " RG:" + aux.cliente.getRg());
			
			aux=aux.prox;
			
		}
		return r;
	}
}