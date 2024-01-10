
public class ArrayNumero5 {
//	En un array de números de 10 posiciones, inicialmente sin valores, deja en cada posición el valor de la función factorial. Para crear una tabla de enteros sin valores: int tabla = new int[10];

		static int factorial(int x) {
			int fact=1;
			for(int i=1;i<=x;i++)
				fact= fact*i;
			return fact;
		}
		

		public static void main(String[] args) {

			int tabla[]=new int[10];

			for(int i=0;i<tabla.length;i++)
				tabla[i]=factorial(i);

			for(int i=0;i<tabla.length;i++)
				System.out.println(i + ": " +tabla[i]);

		}

	}

