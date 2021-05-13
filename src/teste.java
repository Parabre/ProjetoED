import javax.swing.JOptionPane;

import io.fileWR;
import modelo.Lista;
import modelo.aluguel;
import modelo.clientes;

public class teste {
	public Lista<clientes> listCli = new Lista<clientes>();

	public static void main(String[] args) {
	
		 Lista<clientes> listCli = new Lista<clientes>();
		 Lista<aluguel> listAlug = new Lista<aluguel>();
		 fileWR ff = new fileWR();
		
		int op=0;
		
		clientes cli;
		while(op!=99){
			op=Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar cliente \n 2- Cadastrar aluguel \n3- Listar cliente \n4- Listar alugueis"));
			switch(op){
			case 1:
				cli = new clientes();
				String nome = JOptionPane.showInputDialog("Nome do cliente");
				String rg = JOptionPane.showInputDialog("RG do cliente");
				
				cli.setNome(nome);
				cli.setRg(rg);
				ff.salvarDados(cli);
				listCli.cadastrar(cli);
				
				break;
			case 2:
				
				aluguel al = new aluguel();
				
		
				rg = JOptionPane.showInputDialog("RG do cliente");
				String horario = JOptionPane.showInputDialog("hoario do cliente");
				String local = JOptionPane.showInputDialog("Local da festa");
				
				al.setRg(rg);
				al.setHorario(horario);
				al.setlugar(local);
				ff.salvarDados(al);
				listAlug.cadastrar(al);
				break;
				
				
			case 3:
				
				System.out.print(listCli.percorre());
				break;
				
			case 4:
				
				System.out.print(listAlug.percorre());
				break;
				
			default:	
			break;
			
		}

	}


	}
}
	


