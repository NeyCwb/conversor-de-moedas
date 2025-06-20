package conversor.de.moedas;

public abstract class TabelaConversao {
	public static String moedaConversao;
	public static String moedaConvertida;
	private static String[][] moedas = new String[][] { {"Dólar","Real"},
														{"Real", "Dólar"},
														{"Euro", "Real"},
														{"Real", "Euro"},
														{"Iene", "Real"},
														{"Real", "Iene"} };
	public static void tabConversao(int opcaoMenu) {
		
		for (int i = 0; i < moedas.length; i++) {
			moedaConversao = moedas[opcaoMenu - 1][0];
			for (int j = 0; j < moedas[i].length; j++) {
				moedaConvertida = moedas[opcaoMenu - 1][1];
			}
		}
	}
}
