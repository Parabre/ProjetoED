package io;


import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

import interfaces.classeGenerica;


public class fileWR  {

	
	
	public void salvarDados(classeGenerica obj)  {
		 FileWriter arquivo;
		 String text = obj.getAll() + '\n';
		 
	    try {
	    	System.out.println(obj.nameClass());
	    	
	        arquivo = new FileWriter(new File(obj.nameClass()));
	        arquivo.write(text);
	        arquivo.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		
	}

}
