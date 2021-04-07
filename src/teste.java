import javax.swing.JOptionPane;

import modelo.Lista;
import modelo.clientes;

public class teste {

	public static void main(String[] args) {
	

		Lista l=new Lista();
		int op=0;
		
		clientes cli;
		while(op!=99){
			op=Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar cliente \n2- Listar cliente\n"));
			switch(op){
			case 1:
				cli = new clientes();
				String nome = JOptionPane.showInputDialog("Nome do cliente");
				String rg = JOptionPane.showInputDialog("RG do cliente");
				
				cli.setNome(nome);
				cli.setRg(rg);
				l.cadastrar(cli);
				
				break;
			case 2:
				
				l.percorre();
				break;
				
			default:	
			break;
			
		}

	}


	}
}
	


