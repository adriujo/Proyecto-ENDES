/**
 * 
 */
package PrimerEjercicio;

/**
 * @author TARDES
 *
 */
public class operadores_asignacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x;
		int y;
		x = 5; //operador asignaci�n
		y = 2; //operador asignaci�n

		
		//operadores de asignacion combinados
		System.out.printf("El valor de x es %d y el valor de y es %d\n ", x,y);
		x += y;
		//Podemos utilizar indistintamente printf y println 
		System.out.println("Suma combinada x += y" + "........... x vale " + x);
		x = 5;
		x -= y;
		System.out.println("Resta combinada de x-=y" + "............ x vale " + x);
		x=5;
		x*=y;
		System.out.println("Producto combinado de x*=y" + "............ x vale "+x);
		x=5;
		x/=y;
		System.out.println("Divisi�n combinada de x/=y" + " .......... x vale " + x);
		x=5;
		x%=y;
		System.out.println("Resto combinado de x%=y" + "........ x vale " + x);
	}

}
