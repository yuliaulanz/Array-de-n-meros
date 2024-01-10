
public class ArrayNumero4 {
	
//	Rota una posición a la derecha todos los elementos, dejando en primera posición el elemento que estaba en la última posición.


	public static void main(String[] args) {
		
		int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};

        rotarDerecha(tabla);
        System.out.println("Rotar a la derecha: " + arrayToString(tabla));
    }

    static void rotarDerecha(int[] array) {
        int A = array[array.length - 1];

        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = A;
    }

    static String arrayToString(int[] array) {
        return java.util.Arrays.toString(array);
	}

}