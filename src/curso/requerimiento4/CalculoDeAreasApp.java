/*
 * Crear el algoritmo para calcular el área de un rectángulo y un triángulo 
 * rectángulo de altura n metros y la base de n metros. Cuando el área supere 
 * los 789,5 metros cuadrados del rectángulo indicar que la superficie ha 
 * superado el valor permitido.
 * 
 * Nota: Resolver usando clases y técnicas de la programación orientada a 
 * objetos.
 */

package curso.requerimiento4;

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

		areaRectangulo = Area.calcularAreaRectangulo(entrada1, entrada2);
		
		System.out.println();
			
		if (areaRectangulo < 789.5) {
			System.out.println("Dado el Lado de " + entrada1 + " metro(s)");
			System.out.println("y el Lado de " + entrada2 + " metro(s), ");
			System.out.println("el Área del Rectángulo es " + areaRectangulo
					+ " metro(s).");
		} else {
			System.out.println("La superficie ha superado el valor permitido.");
		}

		areaTriangulo = Area.calcularAreaTriangulo(entrada1, entrada2);

		System.out.println();

		System.out.println("Dado la Base de " + entrada2 + " metro(s)");
		System.out.println("y la Altura de " + entrada1 + " metro(s), ");
		System.out.println(
				"el Área del Triángulo es " + areaTriangulo + " metro(s).");

		input.close();
	}
}