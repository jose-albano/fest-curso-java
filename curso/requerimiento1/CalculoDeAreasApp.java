package curso.requerimiento1;

public class CalculoDeAreasApp {

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
