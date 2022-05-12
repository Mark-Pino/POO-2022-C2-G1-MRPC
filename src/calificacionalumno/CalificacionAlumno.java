package calificacionalumno;
import java.util.Scanner;

public class CalificacionAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Definir Variables
        int nota1=0, nota2=0, nota3=0;
        double promedioFinal=0;
        //Datos de entrada
        System.out.println("***** Calcular el promedio final *****");
        System.out.println("Ingrese la nota del primer alumno:");
        nota1=sc.nextInt();
        System.out.println("Ingrese la nota del segundo alumno:");
        nota2=sc.nextInt();
        System.out.println("Ingrese la nota del tercer alumno:");
        nota3=sc.nextInt();
        //Proceso y datos de salida
        if (nota1>=0 && nota1<=20 && nota2>=0 && nota2<=20 && nota3>=0 && nota3<=20){
          promedioFinal=(nota1+nota2+nota3)/3;
          System.out.println("El promedio final es: "+Math.round (promedioFinal));
        }
        else {
          System.out.println("Ingrese bien las notas!");
        }
    }
}
