package br.com.fiap.main;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteArray {
	
	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	//Integer
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	//Double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		// Preparar console
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		
		//Prepara Objeto 
		Cliente objCliente;
		
		// entrada
		
		do {
			
			objCliente = new Cliente();
			objCliente.setCodigo(inteiro("Digite o código"));
			objCliente.setNome(texto("Digite o nome: "));
			objCliente.setRenda(real("Digite a renda: "));
			objCliente.setRg(texto("Digite o RG:"));
			
			listaCliente.add(objCliente);
			
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar mais clientes?",
				"CADASTRO DE CLIENTES", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE)==0);
		
		// Saídas
		//Para arrayList se usa foreach
		for(Cliente c : listaCliente) {
			System.out.println("\n\nCódigo: " + c.getCodigo() +
			           "\n Nome: " + c.getNome() + 
			           "\n Renda do Cliente: " + c.getRenda() +
			           "\n RG do cliente: " + c.getRg());
		}	
	}
}
	


