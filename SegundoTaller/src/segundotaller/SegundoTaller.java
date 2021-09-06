/*Un vendedor minorista en línea requiere un informe de las ventas del día. Para ello cuenta con tres arreglos de n
elementos cada uno: A, B y C. El primero almacena el código de los productos vendidos en el día, El segundo almacena
el valor de venta de cada producto, y el tercero la cantidad de unidades vendidas de cada producto.
 Requiere un aplicativo que le calcule rápidamente los siguientes datos:
 Total productos vendidos en el día.
 Total ingresos por ventas del día.
 El producto más vendido.
 El producto más costoso vendido.*/

package segundotaller;

import java.util.Scanner;

public class SegundoTaller {

   
    public static void main(String[] args) {
        
        
        Scanner entradaA = new Scanner(System.in);
        Scanner entradaB = new Scanner(System.in);
        Scanner entradaC = new Scanner(System.in);
        int limA, limB,limC;
        int[] arregloA = new int[10];
        int[] arregloB = new int[10];
        int[] arregloC = new int[10];
        
        int suma = 0;
        int moda = 0, maximaRepe = 0;
        
        System.out.println("Ingrese cuantos datos desea en el arreglo A:");
        limA = entradaA.nextInt();
        
        System.out.println("Ingrese cuantos datos desea en el arreglo B:");
        limB = entradaB.nextInt();
        
        System.out.println("Ingrese cuantos datos desea en el arreglo C:");
        limC = entradaC.nextInt();
        
        
        for (int i = 1; i <= limA; i++) {
            
            System.out.println("Ingrese el codigo del producto vendido en la posicion : " + i +" del arreglo");
            arregloA[i] = entradaA.nextInt();
          
 
        }
         int mayor = arregloB[0];
        for (int j = 1; j <= limB; j++) {
            
            System.out.println("Ingrese el valor del producto vendido en la posicion : " + j +" del arreglo");
            arregloB[j] = entradaB.nextInt();
            
            suma = suma + arregloB[j];
            
            if (arregloB[j] > mayor) {
                
                mayor = arregloB[j];
                
            }
 
        }
        
        for (int k = 1; k <= limC; k++) {
            
            System.out.println("Ingrese la cantidad de unidades vendidas de productos  c : " + k +" del arreglo");
            arregloC[k] = entradaC.nextInt();
 
        }  
        for (int i = 1; i < arregloA.length ; i++) {
            
            int repite = 0;
            
            for (int j = 1; j < arregloA.length; j++) {
                
                repite++;
            }
            if(repite > maximaRepe){
                
                moda = arregloA[i];
                maximaRepe = repite;
            }
        }
      
        System.out.println(" LA CANTIDAD DE PRODUCTOS VENDIDOS EN EL DIA FUERON DE : "+ limA);
        System.out.println(" EL TOTAL INGRESO POR VENTAS FUERON DE : " +suma);
        System.out.println(" EL PRODUCTO MAS CARO VENDIDO ES EL QUE TIENE EL VALOR DE :  :" +mayor);
        System.out.println(" EL PRODUCTO MAS VENDIDO FUE " + moda + " PORQUE SE VENDIO " +maximaRepe +"VECES");
    }
    
}
