package desafio4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String input = new String();
		
		Scanner leitura = new Scanner(System.in);
		System.out.printf("Insira a palavra/frase que deseja converter: ");
		input = leitura.nextLine();
		leitura.close();
		input = input.toLowerCase();
		
		System.out.println();
		desenharAscii(input);
		
	}
	
	public static void desenharAscii(String input) {
		
		for (int i1 = 0; i1 < input.length(); i1++) {
			char letra = input.charAt(i1);
			if (letra == 'a') {
				System.out.printf("     ");
			} else if (letra == 'b') {
				System.out.printf("__  ");
			} else if (letra == 'c') {
				System.out.printf("__  ");
			} else if (letra == 'd') {
				System.out.printf("__  ");
			} else if (letra == 'e') {
				System.out.printf("___ ");
			} else if (letra == 'f') {
				System.out.printf("___ ");
			} else if (letra == 'g') {
				System.out.printf("__  ");
			} else if (letra == 'h') {
				System.out.printf("     ");
			} else if (letra == 'i') {
				System.out.printf("     ");
			} else if (letra == 'j') {
				System.out.printf("     ");
			} else if (letra == 'k') {
				System.out.printf("     ");
			} else if (letra == 'l') {
				System.out.printf("     ");
			} else if (letra == 'm') {
				System.out.printf("     ");
			} else if (letra == 'n') {
				System.out.printf("     ");
			} else if (letra == 'o') {
				System.out.printf("__  ");
			} else if (letra == 'p') {
				System.out.printf("__  ");
			} else if (letra == 'q') {
				System.out.printf("__  ");
			} else if (letra == 'r') {
				System.out.printf("__  ");
			} else if (letra == 's') {
				System.out.printf("__  ");
			} else if (letra == 't') {
				System.out.printf(" ___  ");
			} else if (letra == 'u') {
				System.out.printf("     ");
			} else if (letra == 'v') {
				System.out.printf("     ");
			} else if (letra == 'w') {
				System.out.printf("     ");
			} else if (letra == 'x') {
				System.out.printf("     ");
			} else if (letra == 'y') {
				System.out.printf("     ");
			} else if (letra == 'z') {
				System.out.printf("__  ");
			} else if (letra == ' ') {
				System.out.printf("     ");
			}
		}
		System.out.printf("\n");
		
		for (int i2 = 0; i2 < input.length(); i2++) {
			char letra = input.charAt(i2);
			if (letra == 'a') {
				System.out.printf(" /\\  ");
			} else if (letra == 'b') {
				System.out.printf("|__) ");
			} else if (letra == 'c') {
				System.out.printf("/  ` ");
			} else if (letra == 'd') {
				System.out.printf("|  \\ ");
			} else if (letra == 'e') {
				System.out.printf("|__  ");
			} else if (letra == 'f') {
				System.out.printf("|__  ");
			} else if (letra == 'g') {
				System.out.printf("/ _` ");
			} else if (letra == 'h') {
				System.out.printf("|__| ");
			} else if (letra == 'i') {
				System.out.printf("|  ");
			} else if (letra == 'j') {
				System.out.printf("   | ");
			} else if (letra == 'k') {
				System.out.printf("|__/ ");
			} else if (letra == 'l') {
				System.out.printf("|    ");
			} else if (letra == 'm') {
				System.out.printf(" |\\/|");
			} else if (letra == 'n') {
				System.out.printf("|\\ | ");
			} else if (letra == 'o') {
				System.out.printf("/  \\ ");
			} else if (letra == 'p') {
				System.out.printf("|__) ");
			} else if (letra == 'q') {
				System.out.printf("/  \\ ");
			} else if (letra == 'r') {
				System.out.printf("|__) ");
			} else if (letra == 's') {
				System.out.printf("/__` ");
			} else if (letra == 't') {
				System.out.printf(" |   ");
			} else if (letra == 'u') {
				System.out.printf("|  | ");
			} else if (letra == 'v') {
				System.out.printf("\\  / ");
			} else if (letra == 'w') {
				System.out.printf("|  | ");
			} else if (letra == 'x') {
				System.out.printf("\\_/  ");
			} else if (letra == 'y') {
				System.out.printf("\\ /  ");
			} else if (letra == 'z') {
				System.out.printf(" /   ");
			} else if (letra == ' ') {
				System.out.printf("     ");
			}
		}
		System.out.println();
		
		for (int i3 = 0; i3 < input.length(); i3++) {
			char letra = input.charAt(i3);
			if (letra == 'a') {
				System.out.printf("/~~\\ ");
			} else if (letra == 'b') {
				System.out.printf("|__) ");
			} else if (letra == 'c') {
				System.out.printf("\\__, ");
			} else if (letra == 'd') {
				System.out.printf("|__/ ");
			} else if (letra == 'e') {
				System.out.printf("|___ ");
			} else if (letra == 'f') {
				System.out.printf("|    ");
			} else if (letra == 'g') {
				System.out.printf("\\__> ");
			} else if (letra == 'h') {
				System.out.printf("|  | ");
			} else if (letra == 'i') {
				System.out.printf("|  ");
			} else if (letra == 'j') {
				System.out.printf("\\__/ ");
			} else if (letra == 'k') {
				System.out.printf("|  \\ ");
			} else if (letra == 'l') {
				System.out.printf("|___ ");
			} else if (letra == 'm') {
				System.out.printf(" |  |");
			} else if (letra == 'n') {
				System.out.printf("| \\| ");
			} else if (letra == 'o') {
				System.out.printf("\\__/ ");
			} else if (letra == 'p') {
				System.out.printf("|    ");
			} else if (letra == 'q') {
				System.out.printf("\\__X ");
			} else if (letra == 'r') {
				System.out.printf("|  \\ ");
			} else if (letra == 's') {
				System.out.printf(".__/ ");
			} else if (letra == 't') {
				System.out.printf(" |   ");
			} else if (letra == 'u') {
				System.out.printf("\\__/ ");
			} else if (letra == 'v') {
				System.out.printf(" \\/  ");
			} else if (letra == 'w') {
				System.out.printf("|/\\| ");
			} else if (letra == 'x') {
				System.out.printf("/ \\  ");
			} else if (letra == 'y') {
				System.out.printf(" |   ");
			} else if (letra == 'z') {
				System.out.printf("/_   ");
			} else if (letra == ' ') {
				System.out.printf("     ");
			}
		}
	}
}