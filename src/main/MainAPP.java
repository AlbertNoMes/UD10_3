/* AUTOR: ALBERT NOTARIO MESTRES
* DATA: 7/02/22
*/

package main;

public class MainAPP {
	public static void main(String[] args) {
		try {
			System.out.println("Generando número aleatorio");
			int entero = (int) (Math.random() * 499 + 1);
			System.out.println("Numero es : " + entero);
			if (entero % 2 == 0) {
				throw new Exception("Se ha generado un numero par");
			} else {
				throw new Exception("Se ha generado un numero impar");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}