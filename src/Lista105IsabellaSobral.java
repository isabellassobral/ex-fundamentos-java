import java.util.Scanner;

public class Lista105IsabellaSobral {

	public static void main(String[] args) {

		//Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------- CALCULAR �REA DE UM TRI�NGULO --------");
		System.out.println("");
		System.out.println("Digite o valor da base do tri�ngulo:");
		float base = sc.nextFloat();
		
		System.out.println("Digite o valor da altura do tri�ngulo:");
		float altura = sc.nextFloat();
		
		float area = base * altura / 2;
		
		System.out.println("A �rea desse tri�ngulo � igual � " + area + ".");
		
		sc.close();

	}

}
