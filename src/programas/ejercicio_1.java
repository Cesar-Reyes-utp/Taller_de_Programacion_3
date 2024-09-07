
package programas;

import java.util.Scanner ;
public class ejercicio_1 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número entero al usuario
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par o impar usando una condicional simple
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        scanner.close();
    }
}