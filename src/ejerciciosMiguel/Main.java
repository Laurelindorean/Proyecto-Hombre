/**
 * 
 */
package ejerciciosMiguel;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @Version 6 ago 2022
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Plebe minion1 = new Plebe("Smeagol", 3000, 200, 500);
		System.out.println(minion1.getNombre() + " : " + minion1.getMoral());
		
		for(int i = 0; i<10; i++) {
			System.out.println(Utils.getNombreAleatorio());
		}

	}

}
