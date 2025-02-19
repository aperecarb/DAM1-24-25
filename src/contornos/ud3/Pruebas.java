package contornos.ud3;

import java.util.Scanner;

public class Pruebas {

    // Método que lea 10 números de teclado y muestre cuántos son pares y cuántos son impares
    static void contarParesImpares() {
        // NODO 1
        int contPares = 0;
        int contImpares = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 10 números: ");

        // NODO 2
        for (int i = 0; i < 10; i++) {
            // NODO 3
            int num = sc.nextInt();
            // NODO 4
            if (num % 2 == 0) {
                // NODO 5
                contPares++;
            } else {
                // NODO 6
                contImpares++;
            } // NODO 7
        }

        // NODO 8
        System.out.printf("Pares: %d\nImpares: %d ", contPares, contImpares);

    }


}
