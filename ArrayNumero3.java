
public class ArrayNumero3 {

	public static void main(String[] args) {
		
//		¿Son todos los elementos del array diferentes?

		 int tabla[]= {3,6,2,77,4,10,23,14};
		 
		 boolean Dif = ((false) || (true));

		 for (int i = 0; i < tabla.length; i++) 
			 
		     for (int j = i + 1; j < tabla.length; j++) 
		    	 
		         if (tabla[i] == tabla[j]);
		 
		 System.out.println("¿Are all the elements of the array different? " + Dif);
	}
}