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

	public Plebe(String nom, int vida, int ataque, int experiencia) {
		super(nom, vida, ataque);
		this.moral = this.generarMoral();
		this.experiencia = experiencia;
	}
	
	
	private String generarMoral() {
		String moral;
		int aleatorio;
		Random random = new Random();
		aleatorio = random.nextInt(2);
		if (aleatorio == 0) {
			moral = "Mala";
		}else {
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

}
