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
	private int vidaMax;

	public Heroe(String nom) {
		super(nom, 100, 15);
		this.defensa = 2;
		this.level = 1;
		this.expActual = 0;
		this.vidaMax = 100;
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

	public int getVidaMax() {
		return vidaMax;
	}

	public void setVidaMax(int vidaMax) {
		this.vidaMax = vidaMax;
	}

	@Override
	public String toString() {
		return "Heroe [nombre=" + super.getNombre() + " vida=" + super.getVida() + " ataque=" + super.getAtaque()
				+ " defensa=" + defensa + ", level=" + level + ", expActual=" + expActual + ", vida Maxima="
				+ this.getVidaMax() + "]";
	}

}
