/**
 * 
 */
package PrimerEjercicio;

import java.util.*;

/**
 * @author TARDES
 *
 */
public class Ejemplo_Relaciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		//clase scanner para peticion de datos
		Scanner teclado = new Scanner (System.in);
		int x, y;
		String cadena;
		boolean resultado;
		System.out.print("Introducir primer numero: ");
		x = teclado.nextInt();
		System.out.print("Introducir segundo numero: ");
		y = teclado.nextInt();
		
		cadena =(x==y)?"iguales":"diferentes";
		System.out.printf("Los numeros %d y %d son %s\n" ,x,y,cadena);
		resultado = (x!=y);
		System.out.println("x != y  // es "+ resultado);
		resultado = (x<y);
		System.out.println("x < y  // es "+ resultado);
		resultado = (x>y);
		System.out.println("x > y  // es "+ resultado);
		resultado = (x<=y);
		System.out.println("x<!= y  // es "+ resultado);
		resultado = (x>=y);
		System.out.println("x >= y  // es "+ resultado);
		
		teclado.close();
	}

}
   