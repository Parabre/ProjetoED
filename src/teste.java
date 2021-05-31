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
			op=Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar Cliente \n 2- Listar Cliente  \n 3- Alterar Cliente \n 4- Excluir Cliente\n "
														   +"5- Cadastrar Aluguel \n 6- Listar Aluguel \n 7- Alterar Aluguel \n 8- Excluir Aluguel\n"));
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
				System.out.print(listCli.percorre());
				break;
				
			case 3:
				System.out.print(listCli.percorre());
				break;
			case 4:
				int pos = Integer.parseInt(JOptionPane.showInputDialog("Posição do cliente"));
				listCli.RemoveAt(pos);
				
			break;
			case 5:
				
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
				
				
			case 6:
				
				System.out.print(listAlug.percorre());
				break;
				
			case 8:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Posição do cliente"));
				listAlug.RemoveAt(pos);
				break;
				
			case 9:
				listCli.ordenar();
				System.out.print("\n" + listCli.percorre());
			break;
				
			default:
				JOptionPane.showMessageDialog(null, "Menu inexistente, escolha outro");
			break;
			
		}

	}


	}
}
	


