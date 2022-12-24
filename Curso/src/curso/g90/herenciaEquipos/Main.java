package curso.g90.herenciaEquipos;

import curso.utilidades.Autocar;

public class Main {

	public static void main(String[] args) {
		Miembro[] lista = new Miembro[10];
		Autocar au = new Autocar();

		lista[0] = new Futbolista(1, "Miguel", "Perez", 20, 7, "lateral");
		lista[1] = new Futbolista(2, "Antonio", "Rodriguez", 20, 7, "lateral");
		lista[2] = new Futbolista(3, "Jose", "garcia", 20, 7, "lateral");
		lista[3] = new Entrenador(4, "Luis", "Piñol", 40, "Federacion 1");
		lista[4] = new Entrenador(5, "Armando", "Sanchez", 42, "Federacion 2");
		lista[5] = new Masajista(6, "Pedro", "Arsen", 30, "Titulo", 3);
		lista[6] = new Masajista(7, "Fernando", "Balta", 35, "masTitulo", 4);

		for (Miembro actual : lista) {
			if (actual != null) {
				au.subir(actual);
				actual.concentrarse();
				actual.viajar();
				if (actual instanceof Futbolista) {
					((Futbolista) actual).jugarPartido();
					((Futbolista) actual).entrenar();
				}
				if (actual instanceof Entrenador) {
					((Entrenador) actual).dirigirPartido();
					((Entrenador) actual).dirigirEntrenamiento();
				}
				if (actual instanceof Masajista) {
					((Masajista) actual).darMasaje();

				}

			}
		}
	}

}
