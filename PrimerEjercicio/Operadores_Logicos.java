/**
 * 
 */
package PrimerEjercicio;

/**
 * @author TARDES
 *
 */
public class Operadores_Logicos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("OPERADORES L�GICOS");

		System.out.println("Negacion\n ! false es: " + (!false));
		System.out.println(" ! true es: " + (!true));

		System.out.println("Operador AND (&) : \n false & false es : " + (false &false));
		System.out.println("true & false es: " + (true & false));
		System.out.println("false & true es: " + (false & true));
		System.out.println("true & true es: " +(true&true));

		System.out.println("Operador OR (|) : \n false | false es : " + (false|false));
		System.out.println("true | false es: " + (true | false));
		System.out.println("false | true es: " + (false | true));
		System.out.println("true | true es: " +(true|true));

		System.out.println("Operador OR Exclusico (^) : \n false ^ false es : " + (false^false));
		System.out.println("true ^ false es: " + (true ^ false));
		System.out.println("false ^ true es: " + (false ^ true));
		System.out.println("true ^ true es: " +(true ^ true));

		System.out.println("Operador || : \n false || false es : " + (false||false));
		System.out.println("true || false es: " + (true || false));
		System.out.println("false || true es: " + (false || true));
		System.out.println("true || true es: " +(true||true));

		System.out.println("Operador && : \n false && false es : " + (false && false));
		System.out.println("true && false es: " + (true && false));
		System.out.println("false && true es: " + (false && true));
		System.out.println("true && true es: " +(true&&true)); 

	}

}
