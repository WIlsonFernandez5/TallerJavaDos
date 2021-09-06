
package segundotaller.Punto10;

import java.util.Scanner;



public class Punto10 {
    
public static void main(String args[]){
    
       double horas = 0;
       double cargos = 0;
       double total = 0;

       
        Scanner entrada = new Scanner(System.in);
        int limA, limB,limC;
        int[] arregloA = new int[10];
        
        
        System.out.println("Ingrese cuantos datos desea en el arreglo A:");
        limA = entrada.nextInt();
        
        
                
        for (int i = 1; i <= limA; i++) {
            
            System.out.println("Ingrese el numero de horas del cohce : " + i +" del arreglo \n" );
            horas = entrada.nextInt();
  
            System.out.printf("El cargo para este usuario es de: %.2f\n", Cargo(horas));
            
             total += Cargo(horas);
        }
        
            
        
         System.out.printf("\nEl cargo total del dia es: %.2f\n", total);
    
    }
    
     public static double Cargo( double x)
    {    

        if ( 3 >= x )
        return 2.0;

        else
        return (2 + 0.5*Math.ceil(x - 3)) <= 10? 2 + 0.5*Math.ceil(x -3) : 10; 

    }    
    
}
