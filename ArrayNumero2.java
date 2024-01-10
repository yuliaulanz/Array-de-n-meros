
public class ArrayNumero2 {

	public static void main(String[] args) {
		
// En un array de 10 valores enteros, ¿es mayor la suma de la primera mitad o la suma de la segunda mitad?

	int tabla[]= {3,6,2,77,3,10,23,14};
		
	  int sumMid1=0;
	  int sumMid2=0;
	  int cantidad=0;
	  for(int i = 0; i < tabla.length/2; i++) {
		  sumMid1=sumMid1 + tabla[i];}
		  
	  for(int i = 0; i < tabla.length; i++) {
		  cantidad= tabla[i] + cantidad;}

		  sumMid2= cantidad - sumMid1;

		  if (sumMid1 > sumMid2) {
			  System.out.println( "Es mayor la suma de la primera mitad: " + sumMid1);
		  } else 
			  if (sumMid1 < sumMid2) {
				  System.out.println( "Es mayor la suma de la segunda mitad: "+ sumMid2);
			  }else

				  if (sumMid1 == sumMid2) 
					  System.out.println( "La suma de la segunda mitad:" +sumMid2 +" es igual que la primera mitad: " +sumMid1 );

		}
	}
