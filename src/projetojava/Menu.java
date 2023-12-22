package projetojava;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int opcao; 
		
		while(true) {
			
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                ASSEMBLY TECH STORE                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Anuncie um Produto                   ");
			System.out.println("            2 - Listar todas os Produtos             ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Dados do produto           ");
			System.out.println("            5 - Vender produto                       ");
			System.out.println("            6 - Comprar produto                      ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt(); 
			
			if (opcao == 7) {
				System.out.println("\nAssembly Tech Store - Com você e seu computador desde 1950!");
				sobre();
				leia.close();
				System.exit(0);
				
				switch(opcao) {
				
				case 1: 
					System.out.println("Anunciar um produto!\n\n");
					
					break;
					
				case 2: 
					System.out.println("Listar todos os produtos\n\n");
					
					break; 
					
				case 3:
					System.out.println("Buscar um produto pelo número\n\n");
					
				break; 
				
				case 4: 
					System.out.println("Atualizar os dados do produto\n\n");
					
					break;
					
				case 5: 
					System.out.println("Vender um produto\n\n");
					
					break;
					
				case 6: 
					System.out.println("Comprar um produto\n\n");
					
				break; 
				
				default: 
					System.out.println("\nOpção Inválida!\n");
					break;
					
					
				
				}
				
				
			}
			
		}
		
		
		

	}

	private static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("David Rocha Bomfim - davidrochabomfim6@gmail.com");
		System.out.println("github.com/David-Bomfim");
		System.out.println("*********************************************************");
		
	}

}
