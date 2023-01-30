package curso.g90.herenciaPersona;

public class testCurso {

	public static void main(String[] args) {
		
		Profesor profe1 = new Profesor("1","Antonio",22,"123456",125f,"10/12/2020");
		Alumno al1 =new Alumno("1","Antonio",22,"123456",5);
		al1.setAsignatura("Mates");
		al1.setAsignatura("Geografia");

	}

}
