/*
Crear un programa que permita ingresar un n�mero (1-5) entero. Visualizar el n�mero ingresado en palabra.
*/
package Programas;
import java.util.Scanner;
public class Propuesto01 {
    public static void main(String[] arg){
        //Declarar variables
        int num;
        String nom;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese un n�mero del 1 al 5:");
        num=lectura.nextInt();
        //Proceso de datos
        nom="";
        switch(num){
            case 1: nom="Uno";
                break;
            case 2: nom="Dos";
                break;
            case 3: nom="Tres";
                break;
            case 4: nom="Cuatro";
            break;
            case 5: nom="Cinco";
            break;
        }
        //Salida de datos
        System.out.println("El nombre del n�mero es: "+nom);
    }
}
