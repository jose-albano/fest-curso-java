package curso.requerimiento2;

import java.util.Scanner;

public class CalculoDeAreasApp {
	
	/*
	 * Crear el algoritmo para calcular el área de un rectángulo y un triángulo 
	 * rectángulo de altura n metros y la base de n metros. Cuando el área 
	 * supere los 124,5 metros cuadrados del rectángulo, indicar que la 
	 * superficie ha superado el valor permitido.
	 * 
	 * Nota: Resolver usando variables del tipo float con un algoritmo de 
	 * programación estructurado.
	 */

	public static void main(String[] args) {

		float entrada1;
		float entrada2;
		float areaRectangulo;
		float areaTriangulo;
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese el Lado 1: ");
		entrada1 = input.nextFloat();
		System.out.println("Ingrese el Lado 2: ");
		entrada2 = input.nextFloat();

		areaRectangulo = entrada1 * entrada2;
		
		System.out.println();
			
		if (areaRectangulo < 124.5) {
			System.out.println("Dado el Lado de " + entrada1 + " metro(s)");
			System.out.println("y el Lado de " + entrada2 + " metro(s), ");
			System.out.println("el Área del Rectángulo es " + areaRectangulo
					+ " metro(s).");
		} else {
			System.out.println("La superficie ha superado el valor permitido.");
		}

		areaTriangulo = (entrada1 * entrada2) / 2;

		System.out.println();

		System.out.println("Dado la Base de " + entrada2 + " metro(s)");
		System.out.println("y la Altura de " + entrada1 + " metro(s), ");
		System.out.println(
				"el Área del Triángulo es " + areaTriangulo + " metro(s).");

		input.close();
	}
}