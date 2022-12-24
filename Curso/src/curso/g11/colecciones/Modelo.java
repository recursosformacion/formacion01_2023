package curso.g11.colecciones;

public class Modelo implements Comparable<Modelo> {

    private int numero;
    
    Modelo(int val){
	numero=val;
    }

    @Override
    public int compareTo(Modelo obj) {
	if (this == obj)
	    return 0;
	if (obj == null)
	    return -1;
	if (getClass() != obj.getClass())
	    return -1;
	Modelo other = (Modelo) obj;
	if (numero > other.numero)
	    return 1;
	
	return 0;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + numero;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Modelo other = (Modelo) obj;
	if (numero != other.numero)
	    return false;
	return true;
    }
}
