/*
 * Crear el algoritmo para calcular el área de un rectángulo y un triángulo 
 * rectángulo de altura n metros y la base de n metros. Cuando el área supere 
 * los 367,5 metros cuadrados del rectángulo, indicar que la superficie ha 
 * superado el valor permitido.
 * 
 * Nota: Resolver usando variables del tipo double, implementado el algoritmo 
 * en un método separándolo del programa principal.
 */

package curso.requerimiento3;

import java.util.Scanner;

public class CalculoDeAreasApp {
	
	public static void main(String[] args) {

		double entrada1;
		double entrada2;
		double areaRectangulo;
		double areaTriangulo;
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese el Lado 1: ");
		entrada1 = input.nextFloat();
		System.out.println("Ingrese el Lado 2: ");
		entrada2 = input.nextFloat();

		areaRectangulo = calcularAreaRectangulo(entrada1, entrada2);
		
		System.out.println();
			
		if (areaRectangulo < 367.5) {
			System.out.println("Dado el Lado de " + entrada1 + " metro(s)");
			System.out.println("y el Lado de " + entrada2 + " metro(s), ");
			System.out.println("el Área del Rectángulo es " + areaRectangulo
					+ " metro(s).");
		} else {
			System.out.println("La superficie ha superado el valor permitido.");
		}

		areaTriangulo = calcularAreaTriangulo(entrada1, entrada2);

		System.out.println();

		System.out.println("Dado la Base de " + entrada2 + " metro(s)");
		System.out.println("y la Altura de " + entrada1 + " metro(s), ");
		System.out.println(
				"el Área del Triángulo es " + areaTriangulo + " metro(s).");

		input.close();
	}
	
	public static double calcularAreaRectangulo(double lado1, double lado2) {
		return lado1 * lado2;
	}
	
	public static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
}