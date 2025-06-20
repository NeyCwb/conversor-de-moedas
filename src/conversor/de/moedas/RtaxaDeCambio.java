package conversor.de.moedas;

public record RtaxaDeCambio(double conversion_rate, String base_code, String target_code) {

@Override
public String toString() {
	return String.format("Cotação %s em relação %s: %.3f",base_code, target_code, conversion_rate);
	}
}

/*
 RETORNO DA API - https://www.exchangerate-api.com/docs/pair-conversion-requests
 
"result": "success",
	"documentation": "https://www.exchangerate-api.com/docs",
	"terms_of_use": "https://www.exchangerate-api.com/terms",
	"time_last_update_unix": 1585267200,
	"time_last_update_utc": "Fri, 27 Mar 2020 00:00:00 +0000",
	"time_next_update_unix": 1585270800,
	"time_next_update_utc": "Sat, 28 Mar 2020 01:00:00 +0000",
	"base_code": "EUR",
	"target_code": "GBP",
	"conversion_rate": 0.8412
}
*/