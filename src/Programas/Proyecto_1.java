package Programas;
import java.util.Scanner;
public class Proyecto_1 {
    public static void main(String[] args){
         //Declarar variables
         int n1,n2,r,opc;
         Scanner lectura=new Scanner(System.in);
         //Entrada de datos
         System.out.print("Ingresar n�mero 1:");
         n1=lectura.nextInt();
         System.out.print("Ingresar n�mero 2:");
         n2=lectura.nextInt();
         System.out.print("Indica la operaci�n a realizar[1(+), 2(-), 3(*), 4(/)]:");
         opc=lectura.nextInt();
         //Proceso de datos
         r=0;
         switch(opc){
             case 1:
                 r=n1+n2;
                 break;
             case 2:
                 r=n1-n2;
                 break;
             case 3:
                 r=n1*n2;
                 break;
             case 4:
                 r=n1/n2;
                 break;
         }
         //Salida de datos
         System.out.println("Resultado");
         System.out.println("El resultado de la operaci�n es: "+r);
    }
}
