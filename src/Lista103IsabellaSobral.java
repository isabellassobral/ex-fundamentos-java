import java.util.Scanner;

public class Lista103IsabellaSobral {

	public static void main(String[] args) {
		
		// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------- CALCULADORA DE IMC --------");
		System.out.println("");
		System.out.println("Digite o seu peso: ");
		float peso = sc.nextFloat();
		
		System.out.println("Digite a sua altura em metros: ");
		float altura = sc.nextFloat();
		
		float imc = peso / (altura*altura);
		
		System.out.println("O seu IMC é " + imc + ".");
		
		sc.close();
	}

}
