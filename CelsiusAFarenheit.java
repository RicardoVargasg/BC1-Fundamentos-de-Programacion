//Celsius a Farenheit

import java.util.Scanner;
public class CelsiusAFarenheit {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Introduce la temperatura en Celsius: ");
	double celsius = scanner.nextDouble();

	double farenheit = (celsius * 9/5) + 32;
	System.out.println(celsius + " C  son " + farenheit + " F ");
	}
} 
