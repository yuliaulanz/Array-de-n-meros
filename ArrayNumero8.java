
public class ArrayNumero8 {

//	¿Es la misma secuencia de números si se leen de izquierda a derecha que de derecha a izquierda?

	static boolean esIgual(int[] tabla) {
		
		for (int i = 0, j = tabla.length - 1; i < j; i++, j--) {
            if (tabla[i] != tabla[j]) {
                return false;

           }
       }
        return true;}

	public static void main(String[] args) {

		 int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};

		  boolean igual = esIgual(tabla);

		  if (igual) 
	            System.out.println("Es igual");
	         else 
	            System.out.println("No es igual");
	}

}