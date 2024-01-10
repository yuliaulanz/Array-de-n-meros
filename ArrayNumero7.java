
public class ArrayNumero7 {
	//¿Hay más pares o impares?
public static void main(String[] args) {
		
		int tabla[]= {3,6,2,77,3,10,23,14};		
		
		int pares=0;
		int impares=0;
		
		for (int i=0; i<tabla.length;i++)
			if (tabla[i] % 2==0)
				pares++;
		System.out.println("Hay " + pares + " números pares");
		
		for (int i=0; i<tabla.length;i++)
			if (tabla[i] % 2==1)
				impares++;
		System.out.println("Hay " + impares + " números impares");
		
		if (pares<impares)
			System.out.println ("Hay más impares que pares");
		if (pares>impares)
			System.out.println ("Hay más pares que impares");
		if (impares==pares)
			System.out.println("Hay el mismo número de pares que de impares");
		

	}

}

