/**
 * 
 */
package ejerciciosMiguel;

import java.util.Random;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @Version 7 ago 2022
 */
public final class Utils {

	private static final String[] ARRAY_NOMBRES = { "Pepe", "Juan", "Miguel", "Mika", "Eva", "Miriam", "Gonzo", "Uruk",
			"Hai", "Nazgul", "Grima", "Lotto", "Otto", "Lobelia" };

	public static String getNombreAleatorio() {
		return ARRAY_NOMBRES[new Random().nextInt(ARRAY_NOMBRES.length)];
	}
}
