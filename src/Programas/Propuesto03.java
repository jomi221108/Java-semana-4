/*
Crear un programa que permita ingresar un número (1-6) entero. Visualizar el número en inglés.
*/
package Programas;
import java.util.Scanner;
public class Propuesto03 {
    public static void main(String[] arg){
        //Declarar variables
        int num;
        String name;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese un número del 1 al 6:");
        num=lectura.nextInt();
        //Proceso de datos
        name="";
        switch(num){
            case 1: name="One";
            break;
            case 2: name="Two";
            break;
            case 3: name="Three";
            break;
            case 4: name="Four";
            break;
            case 5: name="Five";
            break;
            case 6: name="Six";
            break;
        }
        //Salida de datos
        System.out.println("El nombre del número en inglés es: "+name);
    }
}