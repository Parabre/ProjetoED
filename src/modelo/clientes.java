package modelo;

import interfaces.classeGenerica;

public class clientes implements classeGenerica {
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	private String rg;
	private String nome;
	@Override
	
	public String getAll() {
		
		return "Nome: " + this.getNome() +  " RG:" + this.getRg(); 
	}
	@Override
	public String nameClass() {
		return  "clientes";
	
	}

	

}
