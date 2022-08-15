/**
 * 
 */
package ejerciciosMiguel;

public class Heroe extends Personaje {
	private static final int MIN_EXP = 30;
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

	public void curacion() {
		int curacion = (int) (this.vidaMax * 0.5);
		int newVida = 0;
		if (this.getExpActual() >= MIN_EXP && super.getVida() < this.vidaMax) {
			expActual -= MIN_EXP;
			newVida = super.getVida() + curacion;
			if (newVida > this.vidaMax) {
				super.setVida(this.vidaMax);
			} else {
				super.setVida(newVida);
			}
			// super.setVida((newVida > this.vidaMax) ? this.vidaMax : newVida); Operador
			// ternario
		}

	}

	public void subirExp() {
		while (this.expActual >= 100) {
			this.defensa += 2;
			this.vidaMax += 20;
			setAtaque(this.getAtaque() + 5);
			setVida(this.vidaMax);
			this.level += 1;
			this.expActual -= 100;
		}
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
