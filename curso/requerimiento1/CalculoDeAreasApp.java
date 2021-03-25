package curso.requerimiento1;

public class CalculoDeAreasApp {
	
	/*
	 * Crear el algoritmo para calcular el área de un rectángulo y un triángulo 
	 * rectángulo de altura 3 metros y la base de 4 metros.
	 * 
	 * Nota: Resolver usando variables enteras, int, con un algoritmo de 
	 * programación estructurada. 
	 */

	public static void main(String[] args) {

		int entrada1 = 3;
		int entrada2 = 4;
		int areaRectangulo;
		int areaTriangulo;

		areaRectangulo = entrada1 * entrada2;
		areaTriangulo = (entrada1 * entrada2) / 2;

		System.out.println("Dado el Lado de " + entrada1 + " metro(s)");
		System.out.println("y el Lado de " + entrada2 + " metro(s), ");
		System.out.println(
				"el Área del Rectángulo es " + areaRectangulo + " metro(s).");

		System.out.println();

		System.out.println("Dado la Base de " + entrada2 + " metro(s)");
		System.out.println("y la Altura de " + entrada1 + " metro(s), ");
		System.out.println(
				"el Área del Triángulo es " + areaTriangulo + " metro(s).");

	}
}
