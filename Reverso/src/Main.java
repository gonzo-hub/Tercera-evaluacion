import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca la la cadena: ");
		String cadena = teclado.nextLine();
		System.out.println ("La cadena al revés sería: "+ (obtenerReverso(cadena,cadena.length()-1)));

	}

	
	private static String obtenerReverso(String cadena, int pos) {
		
		if(pos==0) {
			return cadena.charAt(pos) + "";
		}
		
		else {
			return cadena.charAt(pos) + (obtenerReverso(cadena, pos-1));
		}
	}
}
