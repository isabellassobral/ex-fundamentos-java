import java.util.Scanner;

public class Lista105IsabellaSobral {

	public static void main(String[] args) {

		//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------- CALCULAR ÁREA DE UM TRIÂNGULO --------");
		System.out.println("");
		System.out.println("Digite o valor da base do triângulo:");
		float base = sc.nextFloat();
		
		System.out.println("Digite o valor da altura do triângulo:");
		float altura = sc.nextFloat();
		
		float area = base * altura / 2;
		
		System.out.println("A área desse triângulo é igual à " + area + ".");
		
		sc.close();

	}

}
