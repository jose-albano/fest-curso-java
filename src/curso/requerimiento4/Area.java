package curso.requerimiento4;

public class Area {

	/**
	 * Para Requerimiento 4 
	 * 
	 * @param lado1
	 * @param lado2
	 * @return El Área de un Rectángulo.
	 */
	public static double calcularAreaRectangulo(double lado1, double lado2) {

		return lado1 * lado2;
	}

	/**
	 * Para Requerimiento 4.
	 * 
	 * @param base
	 * @param altura
	 * @return El Área de un Triángulo.
	 */
	public static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
}