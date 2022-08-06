/**
 * 
 */
package ejerciciosMiguel;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @Version 6 ago 2022
 */
public class Personaje {


	private String nombre;
	private int vida;
	private int ataque;

	public Personaje(String nom, int vida, int ataque) {
		this.nombre = nom;
		this.vida = vida;
		this.ataque = ataque;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	

}
