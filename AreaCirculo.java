//Programa que calcula el área de un circulo dado su radio

import java.util.Scanner;
public class AreaCirculo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el radio del circulo: ");
		double radio = scanner.nextDouble();

		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El área del circulo es: " + area);
	}
} 

		