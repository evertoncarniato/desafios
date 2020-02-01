package desafio3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String input = new String();
		
		Scanner leitura = new Scanner(System.in);
		System.out.printf("Insira a palavra/frase que deseja converter: ");
		input = leitura.nextLine();
		leitura.close();
		
		input = converter(input);	
		System.out.println(input);
		
	}
	
	public static String converter (String input) {
		
		input = input.replaceAll("[0-9]", "");
		input = input.toLowerCase();
		input = input.replace('c', '3');
		input = input.replace('f', '6');
		input = input.replace('i', '9');
		input = input.replace("l", "12");
		input = input.replace("o", "15");
		input = input.replace("r", "18");
		input = input.replace("u", "21");
		input = input.replace("x", "24");
		
		return input;
	}
}
