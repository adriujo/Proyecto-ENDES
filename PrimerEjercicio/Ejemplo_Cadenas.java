/**
 * 
 */
package PrimerEjercicio;

/**
 * @author TARDES
 *
 */
public class Ejemplo_Cadenas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cad1 = "CICLO DAM";
		String cad2 = "ciclo dam";
		
		System.out.printf("La cadena 1 es: %s y la cadena 2 es; %s", cad1,cad2);
	
		System.out.println("La longirud de cad1 es: "+ cad1.length());
		
		//concatenacion de cadenas (unión)
		System.out.printf("\n Concatenación: %s", cad1+cad2);
		
		//Comparacion de cadenas
		System.out.printf("\n cad1.equals(cad2) es %b", cad1.equals(cad2));
		System.out.printf("\n cad1.equalsIgnoreCase(cad2) es %b", cad1.equalsIgnoreCase(cad2));
		System.out.printf("\n cad1.compareTo (cad2) es: %d ", cad1.compareTo(cad2));
		
		//Obtención de subcadenas
		System.out.printf("\n cad1.substring(0,5) es: %s", cad1.substring(0, 5));
		
		//Pasar a minusculas
		System.out.printf("\ncad1.toLowerCase() es; %s", cad1.toLowerCase() );
	}

}
