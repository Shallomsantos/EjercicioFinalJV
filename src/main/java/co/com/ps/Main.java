package co.com.ps;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroIngresado;

        System.out.println("Bienvenido al juego de adivinanzas. Adivina el número secreto entre 1 y 100.");

        do {
            System.out.print("Ingresa un número: ");
            numeroIngresado = sc.nextInt();
            intentos++;

            if (numeroIngresado < numeroSecreto) {
                System.out.println("El número ingresado es menor que el número secreto. Intenta de nuevo.");
            } else if (numeroIngresado > numeroSecreto) {
                System.out.println("El número ingresado es mayor que el número secreto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número secreto en " + intentos + " intentos.");
            }
        } while (numeroIngresado != numeroSecreto);

        sc.close();
    }
}

