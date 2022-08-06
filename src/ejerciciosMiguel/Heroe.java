/**
 * 
 */
package ejerciciosMiguel;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @Version 6 ago 2022
 */
public class Heroe extends Personaje {

	private int defensa;
	private int level;
	private int expActual;

	public Heroe(String nom, int vida, int ataque, int defensa, int level) {
		super(nom, vida, ataque);
		this.defensa = defensa;
		this.level = level;
		this.expActual = 0;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getExpActual() {
		return expActual;
	}
	
	public void setExpActual(int expActual) {
		this.expActual = expActual;
	}

}
