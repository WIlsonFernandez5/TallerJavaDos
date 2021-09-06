
package segundotaller.Punto11;

import java.util.Scanner;


public class Punto11 {
    
    public static void main(String args[]){
    
        int numero = 0;
 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("INGRESE EL NUMERO A INVERTIR : ");
        numero = teclado.nextInt();
        
        Punto11 objeto = new Punto11();
        objeto.InvertirNumero(numero);

        
    }
    
    public void InvertirNumero(int numero){
        
        
        int invertido = 0;
        int resta;
        
        while( numero > 0){
            
            resta = numero%10;
            invertido = invertido * 10 + resta;
            numero /= 10;
            
            
        }
        
        System.out.println("EL NUMERO HA SIDO INVERTIDO ");
        System.out.println("EL NUEVO NUMERO ES : " +invertido);
        
    }
    
}
