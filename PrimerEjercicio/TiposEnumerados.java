package PrimerEjercicio;

public abstract class TiposEnumerados {

public enum Dias {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dias diaactual = Dias.Martes;
		Dias diasiguiente = Dias.Miercoles;
		
		System.out.print("Hoy es ");
		System.out.println (diaactual);
		System.out.println("Mañana\nes\n"+diasiguiente);
		

	} //Fin main

}
