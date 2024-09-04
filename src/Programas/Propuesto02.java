/*
Crear un programa que permita ingresar un número (1-10) entero. Visualizar el número en romanos.
*/
package Programas;
import java.util.Scanner;
public class Propuesto02 {
    public static void main(String[] arg){
        //Definir variables
        int num;
        String rom;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese un número del 1 al 10:");
        num=lectura.nextInt();
        //Proceso de datos
        rom="";
        switch(num){
            case 1: rom="I";
            break;
            case 2: rom="II";
            break;
            case 3: rom="III";
            break;
            case 4: rom="IV";
            break;
            case 5: rom="V";
            break;
            case 6: rom="VI";
            break;
            case 7: rom="VII";
            break;
            case 8: rom="VIII";
            break;
            case 9: rom="IX";
            break;
            case 10: rom="X";
            break;
        }
        //Salida de datos
        System.out.println("El número seleccionado es: "+rom+" en romanos.");
    }
}
