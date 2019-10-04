package views;


public class Validar {
	public static boolean valida_int(String cadena) {
		Integer num;
		try {
			num = Integer.parseInt(cadena);
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	public static boolean valida_float(String cadena) {
		Float num;
		try {
			num = Float.parseFloat(cadena);
			return true;
		} catch (Exception e) { 
			return false;
		}
	 }
	
	public static boolean valida_Double(String cadena) {
		Double num;
		try {
			num =Double.parseDouble(cadena);
			return true;
		} catch (Exception e) { 
			return false;
		}
	 }
	
	public static boolean valida_inpuesto(String cadena) {
		Integer num;
		try {
			num = Integer.parseInt(cadena);
			if(num > 0 && num <=5) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
}
