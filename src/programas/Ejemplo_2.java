package programas;
/**
Crear un programa 
Vizualizar su promedio y su condicion
 */
import java.util.Scanner ;
import java.text.DecimalFormat ; //libreria para decimales

public class Ejemplo_2 {
    public static void main(String[] args) {
    //declaraciond de variable
    double nt1,nt2,nt3,promedio;
    String alumno,condicion ;
    Scanner lectura=new Scanner(System.in) ;
    //limitamos decimales
    DecimalFormat formato=new DecimalFormat("##.##") ;
    //entrada de datos
    System.out.print("Ingresar nombre del Alumno: ");
    alumno=lectura.next() ;
    System.out.print("Ingresar la nota 1: ");
    nt1=lectura.nextInt() ;
    System.out.print("Ingresar la nota 2: ");
    nt2=lectura.nextInt() ;
    System.out.print("Ingresar la nota 3: ");
    nt3=lectura.nextInt() ;
    //proceso de datos
    promedio= (nt1+nt2+nt3)/3 ;
    if(promedio>=12){
        condicion="aprobado";
    }else{
        condicion="desaprobado";
    }
    //salidad de datos
    System.out.println("El promedio es: " + formato.format(promedio));
    System.out.println("la condicion es: " + condicion);
    }
}
