import java.util.Scanner;

public class Lista102IsabellaSobral {

	public static void main(String[] args) {

		// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("-------- CONVERTOR DE TEMPERATURA °C PARA °F --------");
		System.out.println("");
		System.out.println("Digite a temperatura em Celsius que você gostaria de converter para Fahrenheit: ");
		float tempC = sc.nextFloat();
		
		float tempF = (tempC * 9/5) + 32;
		
		System.out.println(tempC + " graus Celsius equivalem à " + tempF + " graus Fahrenheit.");

		sc.close();
	}

}

