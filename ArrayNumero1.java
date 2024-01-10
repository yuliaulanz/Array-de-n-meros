
public class ArrayNumero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		¿Cuántos valores 3 hay en el array?
	
			int tabla[]= {3,6,2,77,3,10,23,14};
				
			int C = 0;
			
			for(int i = 0; i<tabla.length;i++) 
				if(tabla[i]== 3) 
					C++;
				
				System.out.println("Hay " + C +" valores de 3" );
			}
		}