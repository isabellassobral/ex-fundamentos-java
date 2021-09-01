import java.util.Scanner;

public class Lista106IsabellaSobral {

	public static void main(String[] args) {
		
		//Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0) utilizando a f�rmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta.
		
				Scanner sc = new Scanner(System.in);
				
				System.out.println("-------- EQUA��ES DE SEGUNDO GRAU COM BHASKARA --------");
				System.out.println("");
				System.out.println("Considerando a equa��o ax2 + bx + c = 0");
				
				System.out.println("Digite o valor de a: ");
				float a = sc.nextFloat();
				
				System.out.println("Digite o valor de b: ");
				float b = sc.nextFloat();
				
				System.out.println("Digite o valor de c: ");
				float c = sc.nextFloat();
				
				float delta = b*b - 4*a*c;
				
				double x1 = (-b + Math.sqrt(delta)) / 2 * a;
				double x2 = (-b - Math.sqrt(delta)) / 2 * a;
				
				System.out.println("As ra�zes da equa��o " + a + "x� + " + b + "x + " + c + " = 0 s�o " + x1 + " e " + x2 +". O valor de delta � " + delta + ".");
				
	
				
				sc.close();

	}

}
