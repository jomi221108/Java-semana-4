package Programas;
import java.util.Scanner;
public class Proyecto_3 {
    public static void main(String[] arg){
        //Declarar variables
        int num;
        String mes;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese un número del 1 al 12 para conocer el mes al que corresponde:");
        num=lectura.nextInt();
        //Proceso de datos
        mes="";
        switch(num){
            case 1:mes="Enero";
            break;
            case 2:mes="Febrero";
            break;
            case 3:mes="Marzo";
            break;
            case 4:mes="Abril";
            break;
            case 5:mes="Mayo";
            break;
            case 6:mes="Junio";
            break;
            case 7:mes="Julio";
            break;
            case 8:mes="Agosto";
            break;
            case 9:mes="Septiembre";
            break;
            case 10:mes="Octubre";
            break;
            case 11:mes="Noviembre";
            break;
            case 12:mes="Diciembre";
            break;
        }
        //Salida de datos
        System.out.println("El número "+num+" corresponde al mes: "+mes);
    }
    
}
