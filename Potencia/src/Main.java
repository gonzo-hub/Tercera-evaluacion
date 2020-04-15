import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca la base: ");
		int b = teclado.nextInt();
		System.out.println("Introduzca el exponente: ");
		int p = teclado.nextInt();
		
		System.out.println(b + " elevado a " + p + " = " + calcularPotencia(b,p));
	}
		

		public static double calcularPotencia(int b, int p) {
			
			if (p==0) {
				
				return 1;
			}
			
			else  {
				return b * calcularPotencia(b,p-1);
			}
		}

	}
