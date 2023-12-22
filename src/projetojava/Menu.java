package projetojava;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import projeto.model.Hardware;
import projeto.model.Software;
import projeto.util.Cores;

public class Menu {

	private static Object produtos;

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Teste da classe Hardware

		Hardware h1 = new Hardware(2, 2, "Notebook Lavelho", 2000.0f, "Amanda Marcelino", "Semi-Novo");
		h1.visualizar();

		// Teste da classe Software

		Software s1 = new Software(3, 1, "Recuperador de dados corrompidos", 25.0f, "Luciano Acácio", "Brasil");
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

			try {

				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros! ");
				leia.nextLine();
				opcao = 0;
			}
			switch (opcao) {

			case 1:
				System.out.println(Cores.TEXT_WHITE + "Anunciar um produto!\n\n");

				keyPress();

				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os produtos\n\n");
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE + "Buscar um produto pelo número\n\n");
				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar os dados do produto\n\n");
				keyPress();
				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE + "Vender um produto\n\n");
				keyPress();
				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE + "Comprar um produto\n\n");
				keyPress();
				break;

			case 7:
				System.out.println(
						Cores.TEXT_WHITE_BOLD + "\nAssembly Tech Store - Com você e seu computador desde 1950!");
				sobre();
				leia.close();
				System.exit(0);
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
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

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}

}
