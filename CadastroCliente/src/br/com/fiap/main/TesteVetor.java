package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteVetor {
	
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
		
		// Preparar vetor e determinar o máximo de posições
		Cliente [] vetorClientes = new Cliente[2];
		
		// O indice controla as alocações das posições
		int indice=0;
		
		//Entrada
		
		do {
			vetorClientes[indice] = new Cliente();
			vetorClientes[indice].setCodigo(inteiro("Informe o código do cliente:"));
			vetorClientes[indice].setNome(texto("Informe o nome do cliente: "));
			vetorClientes[indice].setRenda(real("Informe a renda do cliente: "));
			vetorClientes[indice].setRg(texto("Informe o RG do cliente: "));
			
			indice ++;
			
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar mais clientes?",
				"CCADASTRO DE CLIENTES", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE)==0);
		
		//Saída
		for(int contador = 0;contador < indice; contador ++){
			System.out.println("\n\nCódigo: " + vetorClientes[contador].getCodigo() +
					           "\n Nome: " + vetorClientes[contador].getNome() + 
					           "\n Renda do Cliente: " + vetorClientes[contador].getRenda() +
					           "\n RG do cliente: " + vetorClientes[contador].getRg());
		}
	}
}
