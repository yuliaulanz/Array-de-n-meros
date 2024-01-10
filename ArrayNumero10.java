
public class ArrayNumero10 {
//	¿Cuántos valores hay divisibles entre 7?


	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};

		 int contador = 0;
		  for (int i = 0; i < tabla.length; i++) {
	            if (tabla[i] % 7 == 0) {
	                contador++;

	            }}System.out.println("Hay "+contador +" valores divisibles entre 7");


	}

}
