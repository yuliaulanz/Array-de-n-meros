
public class ArrayNumero6 {
	// En un array de números de 20 posiciones, inicialmente sin valores, deja en cada posición el valor de la secuencia Fibonacci.

	public static void main(String[] args) {
		 int tabla[] = new int[20];

	        tabla[0] = 0;
	        tabla[1] = 1;

		for(int i=2; i<20; i++) {
			tabla[1]= tabla[i-1] + tabla[i-2];
		}

		System.out.println("Valores de la frecuencia fibannaci:");
		for(int i=2; i<20; i++) {
			System.out.println(tabla[i] + " ");}
		}



	}