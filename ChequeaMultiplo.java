import java.util.Scanner;

public class ChequeaMultiplo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pon un número entero: ");
        int numero = scanner.nextInt();

        Verificador verificador = new Verificador(numero);

        System.out.print("Pon un número para comprobar si es divison: ");
        int multiploDe = scanner.nextInt();

        //Verificacion de si es multiplo
        if (verificador.esMultiplo(multiploDe)) {
            System.out.println(numero + " es multiplo de " + multiploDe);
        } else {
            System.out.println(numero + " no es multiplo de " + multiploDe);
        }
        scanner.close();
    }
}

//Clase auxiliar para verificar

class Verificador {
    private int numero;

    public Verificador(int numero){
            this.numero = numero;
    }

    //Verificador de multiplo

    public boolean esMultiplo(int otroNumero) {
        return numero % otroNumero == 0;
    }
}