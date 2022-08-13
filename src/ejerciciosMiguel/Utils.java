/**
 * 
 */
package ejerciciosMiguel;

import java.util.Random;


public final class Utils {

	private static final String[] ARRAY_NOMBRES = { "Pepe", "Juan", "Miguel", "Mika", "Eva", "Miriam", "Gonzo", "Uruk",
			"Hai", "Nazgul", "Grima", "Lotto", "Otto", "Lobelia" };

	public static String getNombreAleatorio() {
		return ARRAY_NOMBRES[new Random().nextInt(ARRAY_NOMBRES.length)];
	}
	
	public static int getNumeroAleatorio(int min, int max) {
		int aleatorio;
		Random random = new Random();
		aleatorio = random.nextInt(max+1-min)+min;
		return aleatorio;
	}
	

}
