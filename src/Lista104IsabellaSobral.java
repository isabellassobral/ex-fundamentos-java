import java.util.Scanner;

public class Lista104IsabellaSobral {

	public static void main(String[] args) {
		
		//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------- QUADRADO E CUBO DE UM VALOR --------");
		System.out.println("");
		System.out.println("Digite um número para saber seu valor ao quadrado e cubo:");
		double valor = sc.nextDouble();
		
		double valorQuadrado = Math.pow(valor, (double)2);
		double valorCubo = Math.pow(valor, (double)3);
		
		System.out.println(valor + " ao quadrado é " + valorQuadrado + " e ao cubo é " + valorCubo);
		
		sc.close();

	}

}
