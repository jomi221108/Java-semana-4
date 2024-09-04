package Programas;
import java.util.Scanner;
public class Proyecto_4 {
    public static void main(String[] arg){
        //Declarar variables
        int num;
        String estacion;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese el número del mes para conocer la estación:");
        num=lectura.nextInt();
        //Proceso de datos
        estacion="";
        switch(num){
            case 1:
            case 2:
            case 3:
                estacion="Verano";
            break;
            case 4:
            case 5:
            case 6:
                estacion="Otoño";
            break;
            case 7:
            case 8:
            case 9:
                estacion="Invierno";
            break;
            case 10:
            case 11:
            case 12:
                estacion="Primavera";
            break;
        }
        //Salida de datos
        System.out.println("El mes "+num+" corresponde a la estación: "+estacion);
    }
}