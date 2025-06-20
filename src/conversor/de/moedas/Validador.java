package conversor.de.moedas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	 public static boolean validarOpcaoMenu(int opcaoMenu) {
		 	String regex = "^[1-7]$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(String.valueOf(opcaoMenu));
	        return matcher.matches();
	    }
	    
	    public static boolean validarRespSN(String resp) {
	    	String regex = "^[sSnN]$";
	    	Pattern pattern = Pattern.compile(regex);
	    	Matcher matcher = pattern.matcher(resp);
	    	return matcher.matches();
	    }
}
