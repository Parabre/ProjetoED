package modelo;

import interfaces.classeGenerica;

public class aluguel implements classeGenerica {

	private String rgCliente;
	private String horario;
	private String lugar;
	private int tamanho;
	
	
	
	public String getRg() {
		return this.rgCliente;
	}
	
	public String getHorario () {
		return this.horario;
	}

	public String getlugar () {
		return this.lugar;
	}
	
	
	
	
	
	public void setRg(String rg) {
		this.rgCliente = rg;
	}
	
	public void setHorario (String hor) {
		this.horario = hor;
	}

	public void setlugar (String lugar) {
		this.lugar = lugar;
	}


	@Override
	public String getAll() {
		return "Lugar: " + this.getlugar()+  " Horario:" + this.getHorario() + "Cliente RG:" + this.getRg(); 
		
	}

	@Override
	public String nameClass() {
		return "aluguel";
	}

	


	
	
}
