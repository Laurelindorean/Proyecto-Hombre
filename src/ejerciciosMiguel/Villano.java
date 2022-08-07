/**
 * 
 */
package ejerciciosMiguel;

import java.util.Random;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @Version 6 ago 2022
 */
public class Villano extends Personaje {

	private Plebe[] subditos;
	private int experiencia;

	public Villano() {
		super(Utils.getNombreAleatorio(), 80, Utils.getNumeroAleatorio(15, 30));
		this.subditos = this.generarSubditos();
		this.experiencia = 100;
	}

	private Plebe[] generarSubditos() {
		Random random = new Random();

		Plebe[] plebe = new Plebe[Utils.getNumeroAleatorio(5, 10)];
		for (int i = 0; i < plebe.length; i++) {
			plebe[i] = new Plebe();
		}
		return plebe;
	}

	public Plebe[] getSubditos() {
		return subditos;
	}

	public void setSubditos(Plebe[] subditos) {
		this.subditos = subditos;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String toString() {
		return "Villano [nombre=" + super.getNombre() + ", vida=" + super.getVida() + ", ataque=" + super.getAtaque()
				+ ", experiencia=" + this.getExperiencia() + "subditos=" + this.getSubditos() + "]";
	}

}
