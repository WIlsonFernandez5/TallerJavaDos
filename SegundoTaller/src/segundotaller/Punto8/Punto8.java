
package segundotaller.Punto8;

import java.util.Scanner;


public class Punto8 {
    
    public static void main(String[] args) {
    
        Punto8 miObjeto = new Punto8();
        miObjeto.Recibe();
     
    }
    
    public void Recibe(){
        Scanner entrada = new Scanner(System.in);
        int lado;
        System.out.println("\nIngrese un numero entre 1 y 20 para formar un cuadrado");
        lado = entrada.nextInt();
        Imprime(lado);
    }
    
    public void Imprime(int x){
        
        int contadoHorizontal = 1;
        int contadorVertical = 2;
        
        
        while(contadoHorizontal++ <= x){
            
            System.out.print("*");
        }
        System.out.print("\n");
        
        contadoHorizontal = 1;
        
        while (contadorVertical++ < x){
            
            while(x >= contadoHorizontal) {
                
                if((1 == contadoHorizontal) || (x == contadoHorizontal))
                    
                    System.out.print("*");
                    
                    
                else
                    System.out.print(" ");
                    contadoHorizontal++;
                
            }
            System.out.print("\n");
            contadoHorizontal = 1;
        }
        
        contadoHorizontal = 1;
        
        while( contadoHorizontal++ <= x){
            System.out.print("*");
        }
        
        System.out.println("\n");
        
    }
}
