package programas;
/*
Crear un programa que permita ingresar dos numeros y un tipo de operacion
aritmetica (+,-,*,/).
Visualizar el resultado de la operacion aritmetica.
 */
import java.util.Scanner ;
public class ejemplo_3 {
    public static void main(String[] args) {
        double n1,n2,R;
        String ope;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        R = 0;
        System.out.print("Ingresar primer variable: ");
        n1=lectura.nextDouble();
        System.out.print("Ingresar segundo variable: ");
        n2=lectura.nextDouble();
        System.out.print("Ingresar que operacion desea emplear ( + , - , * , / ): ");
        ope=lectura.next();
        //procesos de datos
        if(ope.equals("+")){
            R = n1+n2 ;
        }if(ope.equals("-")){
            R = n1-n2 ;
        }if (ope.equals("*")){
            R = n1*n2 ;
        }if(ope.equals("/")){
            R = n1/n2 ;
        }
        //salida de datos
        System.out.println(R);
    }
}
