package projetojava;

import java.util.Scanner;
import projeto.util.Cores;
import projeto.model.Projeto;
import projeto.model.Software;
import projeto.model.Hardware;

public class Menu {

	public static void main(String[] args ) {
		Scanner leia = new Scanner(System.in);
		
		//teste da classe Projeto 
		
		Projeto p1 = new Projeto(1,2,"Chave de Ativação PascalX",100.0f,"Henrique Maciel");
        p1.visualizar(); 
        
        //Teste da classe Hardware 
        
        Hardware h1 = new Hardware(2,2, "Notebook Lavelho", 2000.0f, "Amanda Marcelino", "Semi-Novo");
        h1.visualizar();
        
        //Teste da classe Software 
        
        Software s1 = new Software(3,1, "Recuperador de dados corrompidos", 25.0f, "Luciano Acácio", "Brasil");
        s1.visualizar();
	

		int opcao;

		while (true) {
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_PURPLE_BACKGROUND
					+ "*****************************************************");

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
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println(
						Cores.TEXT_WHITE_BOLD + "\nAssembly Tech Store - Com você e seu computador desde 1950!");
				sobre();
				leia.close();
				System.exit(0);

				switch (opcao) {

				case 1:
					System.out.println(Cores.TEXT_WHITE + "Anunciar um produto!\n\n");

					break;

				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todos os produtos\n\n");

					break;

				case 3:
					System.out.println(Cores.TEXT_WHITE + "Buscar um produto pelo número\n\n");

					break;

				case 4:
					System.out.println(Cores.TEXT_WHITE + "Atualizar os dados do produto\n\n");

					break;

				case 5:
					System.out.println(Cores.TEXT_WHITE + "Vender um produto\n\n");

					break;

				case 6:
					System.out.println(Cores.TEXT_WHITE + "Comprar um produto\n\n");

					break;

				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
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
