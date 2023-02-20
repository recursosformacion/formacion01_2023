package curso.g88.juegocartas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Jugador {
	private String nombre;
	private int edad;
	private List<Carta> mano;
	
	public Jugador() {
		mano = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public List<Carta> getMano() {
		return mano;
	}
	public void setMano(List<Carta> mano) {
		this.mano = mano;
	}
	public void setCarta(Carta carta) {
		mano.add(carta);
	}
	
	/**
	 * Visualiza los datos de un jugador, y la mano que tiene en este momento
	 * PODEMOS MANDARLO A JUGADOR
	 * 
	 * @param jugador
	 */
	public void visualiza() {
		System.out.println("Jugador: " + getNombre());		
		getMano().forEach(System.out::println);
	}
	/**
	 * Analiza la repeticion de numeros que se produce, y la devuelve en array
	 * @return
	 */
	public int[] calculaJuego() {
		List<Carta> mano = getMano().stream().sorted(Comparator.comparing(Carta::getNumero))
				.collect(Collectors.toList());
		setMano(mano);
		int[] conta = new int[20];
		for (Carta act : mano) { // Defino cuantos numeros iguales hay
			++conta[act.getNumero()];
		}
		return conta;
	}
	/**
	 * Descarta la carta con el numero indicado
	 * 
	 * @param numero
	 */
	public void descarta(int numero) {
		
		for(Iterator<Carta> it = getMano().iterator(); it.hasNext();) {
			if (it.next().getNumero()==numero) {
				it.remove();
			}
		}
	}
	
}
