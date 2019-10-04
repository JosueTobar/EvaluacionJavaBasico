package views;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import views.Validar;
import views.Ejercicios;
public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Double numD = 0d;
		Integer numI = 0;
		String cadena = "";
		Integer menu = 0;
		
		
		do{
			
			System.out.println("-----------------MENU------------------");
			System.out.println("Ejecicio 1              ------------:1");
			System.out.println("Ejecicio 2              ------------:2");
			System.out.println("Ejecicio 3              ------------:3");
			System.out.println("Ejecicio 4              ------------:4");
			System.out.println("Ejecicio 5              ------------:5");
			System.out.println("Ejecicio 6              ------------:6");
			System.out.println("Ejecicio 7              ------------:7");
			System.out.println("Ejecicio 8              ------------:8");
			System.out.println("Salir                   ------------:0");
			System.out.println("Elija una opción        ------------:");
			cadena = leer.nextLine();
			
			
			while (!Validar.valida_int(cadena)){
				System.err.println("error opción no valida");
				System.out.println("Elija una opción        ------------:");
				cadena = leer.nextLine();
			}
			menu = Integer.parseInt(cadena);
			
			
		
		switch (menu) {
		case 1:
				System.out.println("Ejercicio 1");
				System.out.println("---------------------------------------");
				System.out.println("Par o Impar");
				System.out.println("Ingrese un numero        ------------: ");
				cadena = leer.nextLine();
				while (!Validar.valida_int(cadena) ){
					System.err.println("error opción no valida tiene que ser un munero entero");
					System.out.println("Ingrese un numero        ------------: ");
					cadena = leer.nextLine();
				}
				numI = Integer.parseInt(cadena);
				
				if(numI != 0) {
					if(Ejercicios.getParImpar(numI)) {
						System.out.println("El numero es Par");
					}else {
						System.out.println("El numero es Impar");
					}
				}else {System.err.println("El numero es nulo Ingrese un numero entero ");}
				
			break;
		case 2:
					System.out.println("Ejercicio 2");
					System.out.println("Negativo, Positivo o nulo");
					System.out.println("---------------------------------------");
					System.out.println("Ingrese un numero        ------------: ");
					
					cadena = leer.nextLine();
					while (!Validar.valida_int(cadena)){
						System.err.println("error opción no valida tiene que ser un munero entero");
						System.out.println("Ingrese un numero        ------------: ");
						cadena = leer.nextLine();
					}
					numI = Integer.parseInt(cadena);
					
					System.out.println(Ejercicios.getTipoNumero(numI));
			
			break;
		case 3:		System.out.println("Ejercicio 3");
					System.out.println("Nuemero dentro del rango 51-100");
					System.out.println("---------------------------------------");
					System.out.println("Ingrese un numero        ------------: ");
					cadena = leer.nextLine();
					while (!Validar.valida_int(cadena)){
						System.err.println("error opción no valida tiene que ser un munero entero");
						System.out.println("Ingrese un numero        ------------: ");
						cadena = leer.nextLine();
					}
					numI = Integer.parseInt(cadena);
					if(Ejercicios.getIntervalo(numI)) {
						System.out.println("El numero se encuentra en el rango 51 - 100 ");
					}else {System.out.println("El numero esta fuera del rango 51 - 100 ");}
			break;
		case 4:	
					System.out.println("Ejercicio 4");
					System.out.println("---------------------------------------");
					System.out.println("nuemro negativo o superior a 100");
					System.out.println("Ingrese un numero        ------------: ");
					cadena = leer.nextLine();
					while (!Validar.valida_int(cadena)){
						System.err.println("error opción no valida tiene que ser un munero entero");
						System.out.println("Ingrese un numero        ------------: ");
						cadena = leer.nextLine();
					}
					numI = Integer.parseInt(cadena);
					if(Ejercicios.negatiovo_Superior(numI)) {
						System.out.println("El numero cumple con una o de las condiciones ");
						
					}
	
			break;
		case 5:
			List<Integer> edades = new ArrayList<>();
			Integer cont= 0;
			System.out.println("Ejercicio 5");
			System.out.println("---------------------------------------");
			System.out.println("Edades ");
			
			do {
				
				System.out.println("Ingrese una edad        ------------: ");
				cadena = leer.nextLine();
				while (!Validar.valida_int(cadena)){
					System.err.println("error opción no valida tiene que ser un munero entero");
					System.out.println("Ingrese un numero        ------------: ");
					cadena = leer.nextLine();
				}
				numI = Integer.parseInt(cadena);
				if(numI > 0) {
					if(numI >=50){
						cont++;
					}
					
					edades.add(numI);
				}else {System.err.println("edda solo puede ser un numero positivo");}
				
				}while(numI != 0);
			
				System.out.println("Cantidad de edades Ingresadas :"+ edades.size() );
				System.out.println("Cantidad de Personas mayores de 50 años:"+cont);
				System.out.println("Promedio de personas porcentaje: %" +(cont*100 )/edades.size());
			
			break;
		case 6:
			Random random = new Random();
			for(int i =0; i<3; i++){
			    int randomInteger = random.nextInt(80) + 1;
			    System.out.println("pseudo random int in a range : " + randomInteger);
			}
			
			break;
		case 7:
			
			Integer subMenu = 0;
			do {
				System.out.println("-----------------MENU------------------");
				System.out.println("Cadrado                 ------------:1");
				System.out.println("Rectangulo              ------------:2");
				System.out.println("Triangulo               ------------:3");
				System.out.println("Círculo                 ------------:3");
				cadena = leer.nextLine();
				while (!Validar.valida_int(cadena)){
					System.err.println("error opción no valida");
					System.out.println("Elija una opción        ------------:");
					cadena = leer.nextLine();
				}
				subMenu = Integer.parseInt(cadena);
				double altura = 0d;
				double base = 0d;
				double area = 0d;
				switch (subMenu) {
				case 1:
					
					System.out.print("Ingrtese Area: ");
					altura = leer.nextDouble();
					System.out.print("Ingrtese base: ");
					base = leer.nextDouble();
					System.out.println("Area Rectangulo =  "+ (base * altura));
					break;
				case 2:
					System.out.print("Ingrtese Area: ");
					altura = leer.nextDouble();
					System.out.println("Area Cadrado =  "+ (altura * altura));
					break;
				case 3:
				
					System.out.print("altura verticala: ");
					altura = leer.nextDouble();
					System.out.print("Ingrtese base: ");
					base = leer.nextDouble();
					System.out.println("Area triangulo =  "+ ((base) * altura));
					break;
				case 4:
				
					System.out.print("Radio: ");
					altura = leer.nextDouble();
					System.out.println("Area Circulo =  "+ (altura *3.1416));
					break;
				default:
					break;
				}
				
			}while(subMenu != 0);
			
			break;
		case 8:
			
			for(int i = 1; i<= 9; i++) {
				for(int j = 1; j<= 9; j++) {
					if(j-i < 0) {
						System.out.print(" 1");
					}else {
						System.out.print(" "+(j-i));
					}
					
				}
				System.out.println("");
			}
			break;
		default:
			System.err.println("error opción no valida");
			System.out.println("Elija una opción        ------------:");
			cadena = leer.nextLine();
			break;
		}
		
		} while(menu != 0); 
		
	}

}
