package calificacionalumno;
import java.util.Scanner;

public class CalificacionAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Definir Variables
        int nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, nota9, nota10;
        double promedioFinal, calificacionMenor=0, calificacionMayor=0;
        
        //Datos de entrada
        System.out.println("***** Calcular el promedio final *****");
        System.out.println("Ingrese la nota del primer alumno:");
        nota1=sc.nextInt();
        System.out.println("Ingrese la nota del segundo alumno:");
        nota2=sc.nextInt();
        System.out.println("Ingrese la nota del tercer alumno:");
        nota3=sc.nextInt();
        System.out.println("Ingrese la nota del cuarto alumno:");
        nota4=sc.nextInt();
        System.out.println("Ingrese la nota del quinto alumno:");
        nota5=sc.nextInt();
        System.out.println("Ingrese la nota del sexto alumno:");
        nota6=sc.nextInt();
        System.out.println("Ingrese la nota del septimo alumno:");
        nota7=sc.nextInt();
        System.out.println("Ingrese la nota del octavo alumno:");
        nota8=sc.nextInt();
        System.out.println("Ingrese la nota del noveno alumno:");
        nota9=sc.nextInt();
        System.out.println("Ingrese la nota del decimo alumno:");
        nota10=sc.nextInt();
        //Proceso
        //Calificacion Mayor
        if(nota1>nota2 && nota1>nota3 && nota1>nota4 && nota1>nota5 && nota1>nota6 && nota1>nota7 && nota1>nota8 && nota1>nota9 && nota1>nota10){
        calificacionMayor=nota1;
        }
        if(nota2>nota1 && nota2>nota3 && nota2>nota4 && nota2>nota5 && nota2>nota6 && nota2>nota7 && nota2>nota8 && nota2>nota9 && nota2>nota10){
        calificacionMayor=nota2;
        }
        if(nota3>nota2 && nota3>nota3 && nota3>nota4 && nota3>nota5 && nota3>nota6 && nota3>nota7 && nota3>nota8 && nota3>nota9 && nota3>nota10){
        calificacionMayor=nota3;
        }
        if(nota4>nota2 && nota4>nota3 && nota4>nota1 && nota4>nota5 && nota4>nota6 && nota4>nota7 && nota4>nota8 && nota4>nota9 && nota4>nota10){
        calificacionMayor=nota4;
        }
        if(nota5>nota2 && nota5>nota3 && nota5>nota4 && nota5>nota1 && nota5>nota6 && nota5>nota7 && nota5>nota8 && nota5>nota9 && nota5>nota10){
        calificacionMayor=nota5;
        }
        if(nota6>nota2 && nota6>nota3 && nota6>nota4 && nota6>nota5 && nota6>nota1 && nota6>nota7 && nota6>nota8 && nota6>nota9 && nota6>nota10){
        calificacionMayor=nota6;
        }
        if(nota7>nota2 && nota7>nota3 && nota7>nota4 && nota7>nota5 && nota7>nota6 && nota7>nota1 && nota7>nota8 && nota7>nota9 && nota7>nota10){
        calificacionMayor=nota7;
        }
        if(nota8>nota2 && nota8>nota3 && nota8>nota4 && nota8>nota5 && nota8>nota6 && nota8>nota7 && nota8>nota1 && nota8>nota9 && nota8>nota10){
        calificacionMayor=nota8;
        }
        if(nota9>nota2 && nota9>nota3 && nota9>nota4 && nota9>nota5 && nota9>nota6 && nota9>nota7 && nota9>nota8 && nota9>nota1 && nota9>nota10){
        calificacionMayor=nota9;
        }
        if(nota10>nota2 && nota10>nota3 && nota10>nota4 && nota10>nota5 && nota10>nota6 && nota10>nota7 && nota10>nota8 && nota10>nota9 && nota10>nota1){
        calificacionMayor=nota10;
        }
        
        //Calificacion Menor
        if(nota1<nota2 && nota1<nota3 && nota1<nota4 && nota1<nota5 && nota1<nota6 && nota1<nota7 && nota1<nota8 && nota1<nota9 && nota1<nota10){
        calificacionMenor=nota1;
        }
        if(nota2<nota1 && nota2<nota3 && nota2<nota4 && nota2<nota5 && nota2<nota6 && nota2<nota7 && nota2<nota8 && nota2<nota9 && nota2<nota10){
        calificacionMenor=nota2;
        }
        if(nota3<nota2 && nota3<nota3 && nota3<nota4 && nota3<nota5 && nota3<nota6 && nota3<nota7 && nota3<nota8 && nota3<nota9 && nota3<nota10){
        calificacionMenor=nota3;
        }
        if(nota4<nota2 && nota4<nota3 && nota4<nota1 && nota4<nota5 && nota4<nota6 && nota4<nota7 && nota4<nota8 && nota4<nota9 && nota4<nota10){
        calificacionMenor=nota4;
        }
        if(nota5<nota2 && nota5<nota3 && nota5<nota4 && nota5<nota1 && nota5<nota6 && nota5<nota7 && nota5<nota8 && nota5<nota9 && nota5<nota10){
        calificacionMenor=nota5;
        }
        if(nota6<nota2 && nota6<nota3 && nota6<nota4 && nota6<nota5 && nota6<nota1 && nota6<nota7 && nota6<nota8 && nota6<nota9 && nota6<nota10){
        calificacionMenor=nota6;
        }
        if(nota7<nota2 && nota7<nota3 && nota7<nota4 && nota7<nota5 && nota7<nota6 && nota7<nota1 && nota7<nota8 && nota7<nota9 && nota7<nota10){
        calificacionMenor=nota7;
        }
        if(nota8<nota2 && nota8<nota3 && nota8<nota4 && nota8<nota5 && nota8<nota6 && nota8<nota7 && nota8<nota1 && nota8<nota9 && nota8<nota10){
        calificacionMenor=nota8;
        }
        if(nota9<nota2 && nota9<nota3 && nota9<nota4 && nota9<nota5 && nota9<nota6 && nota9<nota7 && nota9<nota8 && nota9<nota1 && nota9<nota10){
        calificacionMenor=nota9;
        }
        if(nota10<nota2 && nota10<nota3 && nota10<nota4 && nota10<nota5 && nota10<nota6 && nota10<nota7 && nota10<nota8 && nota10<nota9 && nota10<nota1){
        calificacionMenor=nota10;
        }
        
        //Datos de salida
        if (nota1>=0 && nota1<=20 && nota2>=0 && nota2<=20 && nota3>=0 && nota3<=20 && nota4>=0 && nota4<=20 && nota5>=0 && nota5<=20 && nota6>=0 && nota6<=20 && nota7>=0 && nota7<=20 && nota8>=0 && nota8<=20 && nota9>=0 && nota9<=20 && nota10>=0 && nota10<=20){
          promedioFinal=(nota1+nota2+nota3+nota4+nota5+nota6+nota7+nota8+nota9+nota10)/10;
          System.out.println("El promedio final es: "+Math.round (promedioFinal));
        }
        else {
          System.out.println("Ingrese bien las notas!");
        }
        System.out.println("La calificacion mayor es: " + calificacionMayor + "\nLa calificacion menor es: " + calificacionMenor);
    }
}
