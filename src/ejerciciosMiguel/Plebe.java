/**
 * 
 */
package ejerciciosMiguel;

import java.util.Random;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @Version 6 ago 2022
 */
public class Plebe extends Personaje {

	private String moral;
	private int experiencia;

	public Plebe() {
		super(Utils.getNombreAleatorio(), Utils.getNumeroAleatorio(20, 30), Utils.getNumeroAleatorio(5, 10));
		experiencia = Utils.getNumeroAleatorio(20, 40);
		moral = generarMoral();
	}

	private String generarMoral() {
		String moral;
		int aleatorio;
		Random random = new Random();
		aleatorio = random.nextInt(2);
		if (aleatorio == 0) {
			moral = "Mala";
		} else {
			moral = "Buena";
		}
		return moral;
	}

	public String getMoral() {
		return moral;
	}

	public void setMoral(String moral) {
		this.moral = moral;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Plebe [nombre=" + super.getNombre() + ", vida=" + super.getVida() + ", ataque=" + super.getAtaque() + ",moral="
				+ this.getMoral() + ", experiencia=" + this.getExperiencia() + "]";
	}
}
