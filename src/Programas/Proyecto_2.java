package Programas;
import java.util.Scanner;
public class Proyecto_2 {
    public static void main(String[] args){
        //Declarar variables
        int num;
        String diasem;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingresar un número del 1 al 7:");
        num=lectura.nextInt();
        //Proceso de datos
        diasem="";
        switch(num){
            case 1:
                diasem="Lunes";
                        break;
            case 2:
                diasem="Martes";
                        break;
            case 3:
                diasem="Miércoles";
                        break;
            case 4:
                diasem="Jueves";
                        break;
            case 5:
                diasem="Viernes";
                        break;
            case 6:
                diasem="Sábado";
                        break;
            case 7:
                diasem="Domingo";
                        break;
        }
        //Salida de datos
        System.out.println("El día seleccionado es: "+diasem);
    }
}
