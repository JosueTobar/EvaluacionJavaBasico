package views;

public class Ejercicios {

	public Ejercicios() {
	}

	public static  boolean getParImpar(Integer num) {
		
		if(num % 2 == 0) {
			return true;
		}else {
			
			return false;
		}	
	}
	
	public static String getTipoNumero(Integer num) {
		
		if(num < 0) {
			return "El Numero es Negativo";
			
		}else if(num > 0) {
			
			return "El numero es Positivo";
		}else return "El numero es Nulo";
	}
	
	public static  boolean getIntervalo(Integer num) {
		if(num >= 51  && num <= 100) {
			return true;
		}else {
			return false;
		}	
	}

	public static  boolean negatiovo_Superior(Integer num) {
	if(num < 0  || num > 100) {
		return true;
	}else {
		return false;
	}	
}


}
