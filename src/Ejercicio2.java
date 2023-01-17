package pro;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Dame una cadena: ");
		StringBuffer cadena=new StringBuffer(sc.next());
		if(esPalindromo(cadena)){
			System.out.println("Es palindromo");
		}
		else {
			System.out.println("No es palindromo");
		}
	}
	public static boolean esPalindromo(StringBuffer cadena){
		StringBuffer reverse=new StringBuffer(cadena);
		if(cadena.reverse().toString().equals(reverse.toString())) {
			return true;
		}
		return false;
	}
}
