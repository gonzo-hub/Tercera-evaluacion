import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca número: ");
		int n = teclado.nextInt();
		System.out.println ("es par " + par(n-1));
		System.out.println ("es impar " + impar (n-1));

		}

	public static boolean par (int n) {
		
		if (n==0)
			return false;
			
			return impar(n-1);
			}
	
	public static boolean impar (int n) {
		
		if (n==0)
			return true;
			
			return par(n-1);
			}

}

