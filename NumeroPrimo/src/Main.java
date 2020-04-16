import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el número: ");
		int numero = teclado.nextInt();
		int divisor = 2;
		
		System.out.println("El número " + numero + numeroPrimo(numero,divisor));
	}

	
	private static String numeroPrimo (int numero,int divisor) {
		
					
		if (numero%divisor == 0) {
			return " no es primo";
			} 
		
		if(numero/2<divisor) {
			return " es primo";
		}
		
		else {
			
			return " es primo" + numeroPrimo(numero,divisor+1);
		}
		
		
		
		
	}
		
}
	


