
package programas;

import java.util.Scanner ;
public class ejercicio_3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Introduce la calificación (0-100): ");
        int calificacion = scanner.nextInt(); 
        
        if (calificacion >= 0 && calificacion <= 100) {
            
            if (calificacion >= 60) {
                System.out.println("Aprobado"); 
            } else {
                System.out.println("Reprobado"); 
            }
        } else {
            System.out.println("Calificación inválida. Introduce un número entre 0 y 100."); // Mensaje de error si está fuera del rango
        }

        scanner.close();
    }
}
