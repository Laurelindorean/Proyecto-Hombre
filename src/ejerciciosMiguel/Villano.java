/**
 * 
 */
package ejerciciosMiguel;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @Version 6 ago 2022
 */
public class Villano extends Personaje {

	private Plebe[] subditos;
	private int experiencia;

	public Villano(String nom, int vida, int ataque, int experiencia) {
		super(nom, vida, ataque);
		this.subditos = this.generarSubditos();
		this.experiencia = experiencia;
	}


	private Plebe[] generarSubditos() {
		
		return null;
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

}
