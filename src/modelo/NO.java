package modelo;

import interfaces.classeGenerica;

public class NO <T extends classeGenerica> {

		public T obj;
		public NO<T> prox;

		
		public NO(T  obj){
			this.obj=obj;
			prox=null;
		}
}






