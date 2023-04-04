package calculadora;

import java.util.Scanner;


public class Calculo {
	Scanner numero = new Scanner(System.in);	
	String suma = "Sumar";
	String resta = "Resta";
	String multiplicar = "Multiplicar";
	String dividir = "Dividir";
	double resultado = 0;
	int operacion = 0;
	double unNumero = 0;
	double otroNumero = 0;
	
	
	public void pantalla() {
		System.out.println("---Bienvenido a la calculadora--");
		System.out.println("");
		System.out.println("Seleccione el número de la operación a realizar");
		System.out.println("");
		System.out.println(" 1. Suma");
		System.out.println(" 2. Resta");
		System.out.println(" 3. Multiplicación");
		System.out.println(" 4. División");
		
		operacion = numero.nextInt(); 		
		
		switch(operacion) {
		case 1: suma();break;
		case 2: resta();break;
		case 3: multiplicar();break;
		case 4: dividir();break;
		
		}
		
	}
	
	public void suma() {
		
		System.out.println("");
		System.out.println("Ingrese el primer valor");
		unNumero = numero.nextDouble();
		
		System.out.println("");
		System.out.println("Ingrese el segundo valor");
		otroNumero = numero.nextDouble();
		
		System.out.println("");

		resultado = unNumero + otroNumero;
		System.out.println("El resultado de la suma es: " + resultado);
	}
	
	public void resta() {
		
		System.out.println("");
		System.out.println("Ingrese el primer valor");
		unNumero = numero.nextDouble();
		
		System.out.println("");
		System.out.println("Ingrese el segundo valor");
		otroNumero = numero.nextDouble();
		
		System.out.println("");

		resultado = unNumero - otroNumero;
		System.out.println("El resultado de la resta es: " + resultado);
		
		
	}
	public void multiplicar() {
		
		System.out.println("");
		System.out.println("Ingrese el primer valor");
		unNumero = numero.nextDouble();
		
		System.out.println("");
		System.out.println("Ingrese el segundo valor");
		otroNumero = numero.nextDouble();
		
		System.out.println("");

		resultado = unNumero * otroNumero;
		System.out.println("El resultado de la multiplicación es: " + resultado);
	
	
}
	public void dividir() {
		
		
		
		System.out.println("");
		System.out.println("Ingrese el primer valor");
		unNumero = numero.nextDouble();
		
	
		System.out.println("");
		System.out.println("Ingrese el segundo valor");
		otroNumero = numero.nextDouble();
		
		if(otroNumero >0 || otroNumero <0) {
		System.out.println("");

		resultado = unNumero / otroNumero;
		System.out.println("El resultado de la división es: " + resultado);
		}else {
			
		System.out.println("No se puede dividir por 0");
		}
	
}
	public static void main(String[] args) {
		Calculo nm = new Calculo();
		nm.pantalla();
	
	}

}
