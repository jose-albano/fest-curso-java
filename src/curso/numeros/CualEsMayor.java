package curso.numeros;

public class CualEsMayor {

	public CualEsMayor() {
		super();
	}

	public static void main(String[] args) {
		//CualEsMayor cualEsMayor = new CualEsMayor();
		
		int entero1 = 6;
		int entero2 = 4;
		
		String salida = "";

		if (entero1 == entero2) {
			salida = "Son iguales";

		} else {

			if (entero1 > entero2) {
				salida = "El entero1 es mayor que el entero2";
			} else {
				salida = "El entero2 es mayor que el entero1";
			}
		}

		System.out.println(salida);
	}

}