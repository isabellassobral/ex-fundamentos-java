import java.util.Scanner;

public class Lista101IsabellaSobral {

	public static void main(String[] args) {
		
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------- CONVERTOR DE TEMPERATURA �F PARA �C --------");
		System.out.println("");
		System.out.println("Digite a temperatura em Fahrenheit que voc� gostaria de converter para Celsius: ");
		float tempF = sc.nextFloat();
		
		float tempC = (tempF - 32) * 5/9;
		
		System.out.println(tempF + " graus Fahrenheit equivalem � " + tempC + " graus Celsius.");

		sc.close();
	}

}



