
package programas;

import java.util.Scanner ;

public class ejercicio_2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Introduce la calificación (0-100): ");
        int calificacion = scanner.nextInt();
        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("La calificación es: A");
        } else if (calificacion >= 80 && calificacion < 90) {
            System.out.println("La calificación es: B");
        } else if (calificacion >= 70 && calificacion < 80) {
            System.out.println("La calificación es: C");
        } else if (calificacion >= 60 && calificacion < 70) {
            System.out.println("La calificación es: D");
        } else if (calificacion >= 0 && calificacion < 60) {
            System.out.println("La calificación es: F");
        } else {
            System.out.println("Calificación inválida. Introduce un número entre 0 y 100."); // Mensaje de error si está fuera del rango
        }

        scanner.close(); 
    }
}
