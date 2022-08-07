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
		
		
		Villano villano1 = new Villano ();
		//System.out.println(minion1.getNombre() + " : " + minion1.getMoral());
		
		Plebe plebeyo1 = new Plebe();
		Heroe hero1 = new Heroe("Frodo");
		System.out.println(plebeyo1);
		System.out.println(hero1);
		/*for(int i = 0; i < villano1.getSubditos().length; i++) {
			Plebe plebeyo = villano1.getSubditos()[i];
			
			System.out.println("Plebe [nombre=" + plebeyo.getNombre() + ", vida=" + plebeyo.getVida() + ", ataque=" + plebeyo.getAtaque() + ",moral="
					+ plebeyo.getMoral() + ", experiencia=" + plebeyo.getExperiencia() + "]");
		}*/
		
		/*for(int i = 0; i<10; i++) {
			System.out.println(Utils.getNombreAleatorio());
		}*/
		

	}

}
