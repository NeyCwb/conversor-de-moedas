package conversor.de.moedas;

import java.io.IOException;
import java.util.Scanner;

public class AppConversorDeMoedas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		int opcaoMenu;
		double cotacao = 0.0;

		System.out.println("\n\tCONVERSOR DE MOEDAS\n\t" + "▬".repeat(19));

		System.out.println("""
				\n\t1. Dólar   =>\tReal
				\n\t2. Real    =>\tDólar
				\n\t3. Euro    =>\tReal
				\n\t4. Real    =>\tEuro
				\n\t5. Iene    =>\tReal
				\n\t6. Real    =>\tIene
				\n\t7. SAIR
				""");
		
		while (loop) {
			do {
				System.out.print("\n\tDigite a opção: ");
				opcaoMenu = scan.nextInt();
				scan.nextLine();

				if (!Validador.validarOpcaoMenu(opcaoMenu)) System.out.println("\n\tOpção inválida!");

			} while (!Validador.validarOpcaoMenu(opcaoMenu));

			if (opcaoMenu == 7) {
				loop = false;
			} else {
				try {
					TabelaConversao.tabConversao(opcaoMenu);
					ConversorMoedas conversor = new ConversorMoedas(opcaoMenu);
					cotacao = conversor.getValorCotacaoMoeda();
					
					System.out.println("\n\t" + "─".repeat(42));

					System.out.printf("\n\tCotação do %s(%s) em relação %s(%s) \n\n\t\t\t   %,.2f",
										TabelaConversao.moedaConversao,
										conversor.getMoedaConversao(),
										TabelaConversao.moedaConvertida,
										conversor.getMoedaConvertida(),
										cotacao);
					
					System.out.printf("\n\n\n\tDigite o valor em %s: ", TabelaConversao.moedaConversao);
					conversor.setValorConversao(scan.nextDouble());
					
					System.out.printf("\n\tConversão para %s...: %,.2f",
									  TabelaConversao.moedaConvertida, conversor.converterMoeda());
					
					System.out.println("\n\n\t" + "─".repeat(42));
					
				} catch (IOException | InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println("\n\tConversor Finalizado!");
		scan.close();
	}
}
