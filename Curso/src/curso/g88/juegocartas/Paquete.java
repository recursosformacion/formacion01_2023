package curso.g88.juegocartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Paquete {
	static final String POKER = "POK";
	static final String ESPAÑOLA = "ESP";

	static final String[] PALOS_POKER = {"corazones","diamantes","picas","trebol"};
	static final String[] PALOS_ESPAÑOLA = {"oros","copas","espadas","bastos"};
	
	private Set<Carta> baraja = new HashSet<>();

	public Paquete(String tipo) {
		String[] palo;
		int num=13;
		if (tipo.equals(POKER)) {
			palo=PALOS_POKER;
			num=14;
		} else {
			palo=PALOS_ESPAÑOLA;
		}
		for (String pa : palo) {
			for (int a = 1; a < num; a++) {
				Carta car = new Carta();
				car.setNumero(a);
				car.setPalo(pa);
				getBaraja().add(car);
			}
		}
	}

	public Set<Carta> getBaraja() {
		return baraja;
	}
	
	private void setCartas(Set<Carta> ba) {
		baraja = ba;
	}
	
	public void listaCartas() {
		getBaraja().forEach(System.out::println);
	}
	
	public void barajarOLD() {
		List<Carta> agitar = new ArrayList<Carta>(getBaraja());
		// Permuta aleatoriamente la lista.
		Collections.shuffle(agitar);
		// Crea un nuevo Set en donde se almacenarán los datos ordenados aleatoriamente.
		Set<Carta> barajado = new HashSet<>();
		// Agrega los valores ordenados alatoriamente a un nuevo Set.
		barajado.addAll(agitar);
		setCartas(barajado);
	}
	public void barajar() {
		List<Carta> agitar = new ArrayList<Carta>(getBaraja());
		List<Carta> agitado = new ArrayList<Carta>();
		while (agitar.size()>0) {
			int numer = (int) Math.random()*agitar.size();
			agitado.add(agitar.get(numer));
			agitar.remove(numer);
		}
		
		// Crea un nuevo Set en donde se almacenarán los datos ordenados aleatoriamente.
		Set<Carta> barajado = new HashSet<>();
		// Agrega los valores ordenados alatoriamente a un nuevo Set.
		barajado.addAll(agitado);
		setCartas(barajado);
	}

}
