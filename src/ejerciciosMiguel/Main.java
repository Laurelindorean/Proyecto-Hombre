/**
 * 
 */
package ejerciciosMiguel;

/**
 * @author Miguel �. Sastre <sastre113@gmail.com>
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
		System.out.println("Las estadisticas de combate del heroe " + hero1.getNombre() + " antes de la lucha son:");
		System.out.println(hero1);
		hero1.setVida(30);
		hero1.setExpActual(250);
		System.out.println("El heroe " + hero1.getNombre() + " ha ganado " + hero1.getExpActual() + " de experiencia al ganar el combate");
		hero1.subirExp();
		System.out.println("Las estadisticas de combate del heroe " + hero1.getNombre() + " después de la lucha son:");
		System.out.println(hero1);
		//hero1.curacion();
		//System.out.println(hero1.getVida());
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
