
package segundotaller.Punto7;

import java.util.Scanner;


public class Punto7 {
    
    
    public static void main(String[] args) {
    
    
        int numero , mayor;
        int contador = 1;
        Scanner entrada = new Scanner(System.in);
        
         System.out.printf("\nPor favor introduzca el numero %d: ", contador++);
         mayor = entrada.nextInt();
         while( 10 >= contador){
             
             System.out.printf("\nPor favor ingrese el numero %d: ", contador++);
             numero = entrada.nextInt();
             if(numero > mayor){
                 
                 mayor = numero;
             }
         }
         
         System.out.println(" El numero mayor es : " +mayor);
        
        
    
    
    
    }
    
    
    
    
    
}
