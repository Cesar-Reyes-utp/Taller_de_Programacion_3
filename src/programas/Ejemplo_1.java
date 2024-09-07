
package programas;
/**
Crear un programa en Java que permita ingresar cuatro numeros enteros**
Visualizar el mayor numero 
 */
import java.util.Scanner ;

public class Ejemplo_1 {
    public static void main(String[] args) {
        //declaracion de variables
        int n1,n2,n3,n4,M;
        Scanner lectura=new Scanner(System.in) ;
        //entrada de datos
        System.out.print("Ingresar Numero 1: ") ;
        n1=lectura.nextInt() ;
        System.out.print("Ingresar Numero 2: ") ;
        n2=lectura.nextInt() ;
        System.out.print("Ingresar Numero 3: ") ;
        n3=lectura.nextInt() ;
        System.out.print("Ingresar Numero 4: ") ;
        n4=lectura.nextInt() ;
        //procesos de datos
        M = n1 ;
        if(n2>M){
            M = n2 ;
        }
        if(n3>M){
            M = n3 ;
        }
        if(n4>M){
            M = n4 ;
        }      
        //salida de datos
        System.out.println("El numero mayor es: " + M) ;
    }
    
}
