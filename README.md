# 💱 Conversor de Moedas em Java

Projeto de conversor de moedas em linha de comando, desenvolvido em Java, que utiliza a **ExchangeRate-API** para obter taxas de câmbio em tempo real.

## 🚀 Funcionalidades

- Menu com 6 opções de conversão entre moedas populares.
- Entrada do valor a ser convertido via terminal.
- Consumo da API ExchangeRate-API via `HttpClient` e `HttpRequest`.
- Mapeamento do JSON de resposta em um `record` Java.
- Conversão precisa e exibição do resultado no terminal.

## 🛠️ Tecnologias e Recursos Utilizados

- **Java 17+**
- **ExchangeRate-API** (https://www.exchangerate-api.com/)
- `HttpClient`, `HttpRequest`, `HttpResponse`
- `java.util.Scanner` para entrada do usuário
- `record` para modelar o JSON de resposta

## 📋 Exemplo do Menu

Ao executar o programa, o usuário verá o seguinte menu:








	CONVERSOR DE MOEDAS
	▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

	1. Dólar   =>	Real

	2. Real    =>	Dólar

	3. Euro    =>	Real

	4. Real    =>	Euro

	5. Iene    =>	Real

	6. Real    =>	Iene

	7. SAIR


	Digite a opção: 1

	──────────────────────────────────────────

	Cotação do Dólar(USD) em relação Real(BRL) 

			   5,49


	Digite o valor em Dólar: 100,0

	Conversão para Real...: 549,18

	──────────────────────────────────────────


O usuário digita o número da opção conforme apresenta o menu. Em seguida solicita a digitação do valor a ser covertido e na sequência será exibido o valor da conversão.

## 📦 Exemplo de Uso
====== CONVERSOR DE MOEDAS ======
1. Dólar (USD) → Real (BRL)
...
Digite a opção: 1
Digite o valor a ser convertido: 100,0
Coversão para Real...:  549.18

🧠 Como funciona
O programa solicita ao usuário a escolha da conversão e o valor.
Com base nas moedas escolhidas, monta uma URL para a ExchangeRate-API.

Usa HttpClient e HttpRequest para fazer uma requisição GET.

Mapeia a resposta JSON para um record. 

🔑 Requisitos
Java 17 ou superior

Acesso à internet para consultar a API

Chave de API da ExchangeRate-API 

🛠️ Como executar
Clone o repositório:
git clone https://github.com/NeyCwb/conversor-de-moedas.git
cd conversor-de-moedas
Compile o projeto:
javac ConversorMoedas.java
Execute o programa:
java ConversorMoedas
📎 Observações
A versão gratuita da ExchangeRate-API permite apenas um número limitado de requisições por mês.

Para uso contínuo, considere obter uma chave de API com um plano adequado.

📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

Desenvolvido com ☕ por Ney Cruz
