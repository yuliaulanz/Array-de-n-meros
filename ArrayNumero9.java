
public class ArrayNumero9 {
//	En un array de 8 posiciones, cargar valores aleatorios de 0 a 39 (ambos límites incluidos), pero sin que se repitan.

	static boolean seRepite(int t[],int numero, int cantidad) {
				for(int i=0; i<cantidad;i++)
					if(t[i]==numero)
						return true;
						return true;

			}

			public static void main(String[] args) {
		int tabla[]=new int[8];

		for (int i = 0; i < tabla.length; i++) {
			int aleatorio=(int)Math.floor(Math.random()*40);
			if(seRepite(tabla, aleatorio, i));
		tabla[i]=aleatorio;
			}		
					for(int i = 0; i < tabla.length; i++) {

					System.out.println(i +" - "+ tabla[i]);}
}
}