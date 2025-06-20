package conversor.de.moedas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public abstract class GeradorEndPoint {
	
	public static String gerarEndPoint(int opcaoMenu) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));
		String apiKey = prop.getProperty("API_KEY");
			
		String endPoint = "https://v6.exchangerate-api.com/v6/"+apiKey+"/";
		
		switch (opcaoMenu) {
		case 1:
			endPoint += "pair/USD/BRL";
			break;
		case 2:
			endPoint += "pair/BRL/USD";
			break;
		case 3:
			endPoint += "pair/EUR/BRL";
			break;
		case 4:
			endPoint += "pair/BRL/EUR";
			break;
		case 5:
			endPoint += "pair/JPY/BRL";
			break;
		case 6:
			endPoint += "pair/BRL/JPY";
			break;
		}
		return endPoint;
	}
}