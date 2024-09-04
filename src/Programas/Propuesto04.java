/*
Crear un programa que permita ingresar un número (1,2,3,4,6,12) entero. Visualizar el nombre del periodo anual
*/
package Programas;
import java.util.Scanner;
public class Propuesto04 {
    public static void main(String[] arg){
        //Declarar variables
        int num;
        String peri;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese uno de los siguientes números: 1, 2, 3, 4, 6 o 12");
        num=lectura.nextInt();
        //Proceso de datos
        peri="";
        switch(num){
            case 1: peri="Mensual";
                break;
            case 2: peri="Bimestral";
                break;
            case 3: peri="Trimenstrual";
                break;
            case 4: peri="Cuatrimestre";
            break;
            case 6: peri="Semianual";
            break;
            case 12: peri="Anual";
            break;
        }
        //Salida de datos
        System.out.println("El nombre del período elegido es: "+peri);
    }
}
