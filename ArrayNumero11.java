
public class ArrayNumero11 {
	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};

		int primo;
		for(int i=2; i<tabla.length; i++)
			if(tabla.length % i==1) {
				primo=1;
				System.out.println("Hay "+ primo+" numero primo");
			}
	}

}

