package curso.g88.juegocartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Juego {

	static int CARTAS = 5; // Cartas en la mano
	static String TIPO_BARAJA = Paquete.POKER; // Tipo de baraja POK er / ESP añola

	static Paquete pq;
	static Set<Carta> baraja;

	static Set<Jugador> jugadores;

	public static void main(String[] args) {

		pq = new Paquete(TIPO_BARAJA);
		pq.barajar();
		baraja = pq.getBaraja();
	//	pq.listaCartas()

		jugadores = recibeJugadores();
		reparte( jugadores);
		visualiza(jugadores);
		descarte(jugadores);
		visualiza(jugadores);
		// ----------------------------------------------------------------------------------
		// descarte(jugadores)

	} // migarcia@recursosformacion.com

	static Set<Jugador> recibeJugadores() {
		Set<Jugador> salida = new HashSet<>();
		Jugador ju1 = new Jugador();
		Jugador ju2 = new Jugador();
		Jugador ju3 = new Jugador();
		Jugador ju4 = new Jugador();
		ju1.setNombre("Miguel");
		salida.add(ju1);
		ju2.setNombre("Antonio");
		salida.add(ju2);
		ju3.setNombre("Pedro");
		salida.add(ju3);
		ju4.setNombre("Luis");
		salida.add(ju4);
		return salida;
	}

	/**
	 * Hace el reparto inicial de cartas, entregando sucesivamente a cada jugador
	 * una carta de la baraja hasta llegar al maximo solicitado
	 * 
	 * @param baraja
	 * @param jugadores
	 */
	static void reparte(Set<Jugador> jugadores) {
		
		for (int a = 0; a < CARTAS; a++) {
			for (Iterator<Jugador> ju = jugadores.iterator(); ju.hasNext();) {
				reparteJugador(ju.next(), 1);
			}
		}

	}

	/**
	 * Entrega a un jugador el numero de cartas de la baraja indicadas, y se borran
	 * de la baraja
	 * 
	 * @param jugador
	 * @param nCartas a entregar
	 */
	static void reparteJugador( Jugador jugador, int nCartas) {
		Iterator<Carta> it = baraja.iterator();
		for (int a = 0; a < nCartas; a++) {
			jugador.setCarta(it.next());
			it.remove();
		}
	}

	static void visualiza(Set<Jugador> jugadores) {
		for (Iterator<Jugador> ju = jugadores.iterator(); ju.hasNext();) {
			Jugador jugador = ju.next();
			jugador.visualiza();
		}
	}

	static void descarte(Set<Jugador> jugadores) {
		for (Iterator<Jugador> ju = jugadores.iterator(); ju.hasNext();) {
			Jugador jugador = ju.next();
			descartaYreparte(jugador);
		}
	}

	static void descartaYreparte(Jugador jugador) {
		int[] conta = jugador.calculaJuego();
		for (int a = 1; a < conta.length; a++) {
			if(conta[a]==1) {
				jugador.descarta(a);
			}
		}
		reparteJugador(jugador, CARTAS - jugador.getMano().size());
		analizaJugador(jugador);
	}

	static void analizaJugador(Jugador jugador) {
		int[] conta = jugador.calculaJuego();
		String juego = "";
		for (int a = 1; a < conta.length; a++) {
			switch (conta[a]) {
			case 2:
				juego += " pareja de " + a;
				break;
			case 3:
				juego += " trio de " + a ;
				break;
			case 4:
				juego += " poker de " + a ;
				break;
			case 5:
				juego += " repoker de " + a ;
				break;
			}
		}
		System.out.println(" Juego:" + juego);

	}
}
