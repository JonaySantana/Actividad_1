import java.util.Scanner;

import javax.swing.JOptionPane;

public class Actividad_1 {

	public static void main(String[] args) {
		hola();

	}
	public static void hola(){
		Scanner Teclado =new Scanner (System.in);
		System.out.println("como te llamas? ");
		String name=Teclado.nextLine();
		JOptionPane.showConfirmDialog(null, "Hola "+name);
		
		Teclado.close();
	}
}
