package conversor.de.moedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConversorMoedas {
	private int opcaoMenu = 0;
	private String moedaConversao;
	private String moedaConvertida;
	private double valorCotacaoMoeda = 0;
	private double valorConversao = 0.0;
	public RtaxaDeCambio rCotacaoMoeda = new RtaxaDeCambio(valorCotacaoMoeda,
															moedaConversao,
															moedaConvertida);
	
	public ConversorMoedas(int opcaoMenu) throws IOException, InterruptedException {
		this.opcaoMenu = opcaoMenu;
		cotacaoMoeda();
	}
	
	public double converterMoeda() {
		return valorCotacaoMoeda * valorConversao;
	}
	
	private void cotacaoMoeda() throws IOException, InterruptedException {
		Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
		String endPoint = GeradorEndPoint.gerarEndPoint(opcaoMenu);	
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endPoint)).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		String responseJson = response.body();
		
		rCotacaoMoeda = gson.fromJson(responseJson, RtaxaDeCambio.class);
		valorCotacaoMoeda = rCotacaoMoeda.conversion_rate();
		moedaConversao = rCotacaoMoeda.base_code();
		moedaConvertida = rCotacaoMoeda.target_code();
	}
	
	public String getMoedaConversao() {
		return moedaConversao;
	}
	
	public String getMoedaConvertida() {
		return moedaConvertida;
	}
	
	public double getValorMoedaConversao() {
		return valorConversao;
	}
	
	public void setValorConversao(double valor) {
		valorConversao = valor;
	}
	
	public double getValorCotacaoMoeda() {
		return valorCotacaoMoeda;
	}
}
