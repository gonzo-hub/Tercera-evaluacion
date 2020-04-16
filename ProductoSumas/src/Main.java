
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el primer número: ");
		int a = teclado.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int b = teclado.nextInt();
		
		System.out.println("El resultado de multiplicar " + a + " por " + b + " es: " + multiplicar(a,b));
	}


public static int multiplicar(int a, int b) {
	
	if (a==0) {
		return 0;
	}
	
	if (b==0){
		return 0;}
	
	else {
		return a + multiplicar(a,b-1);
}
}
}