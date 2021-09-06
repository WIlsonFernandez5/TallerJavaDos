
package segundotaller.Punto3;

import java.util.Scanner;


public class Punto3 {
    
     public static void main(String[] args) {
         
       
        int limA;
        int[] arregloA = new int[10];
        int[] arregloB = new int[10];
        int nuevoSaldo = 0; 
        int nuevoSaldo1 = 0;   
        Scanner entrada = new Scanner(System.in);

        Scanner ventas = new Scanner(System.in);
        
         
        
        int op;
        int valor1;
         
          Scanner teclado = new Scanner (System.in);
        
        do{
            
            System.out.println("1. Categoria A");
             System.out.println("2. Categoria B");
             System.out.println("3. Salir");
             
             System.out.print("Escoja Su Opcion ");
             System.out.println("");
             op=teclado.nextInt();
             
            switch(op){
            
                
                case 1:
                       System.out.println("Categoria A");
                        System.out.println("Ingrese cuantos datos desea ingresar : ");
                        limA = entrada.nextInt();
                        for (int i = 1; i <= limA; i++) {
            
                            System.out.println("Ingrese el monto vendido del vendedor : ");
                            arregloB[i] = ventas.nextInt();
                        }
                        
                        for (int i = 1; i <arregloB.length; i++) {
             
                                if(arregloB[i] > 3000){
                 
                                     nuevoSaldo =  (arregloB[i]*5)/100 + 200; 
                 
                                        if(arregloB[i] >= 5000 &&  arregloB[i] <= 7000){
                     
                                            nuevoSaldo = (arregloB[i]*7)/100+200;
                     
                                                if (arregloB[i] > 7000) {
                         
                                                    nuevoSaldo = (arregloB[i]*10)/100+200;
                                                }
                                        } 
                                }
                        }
                        System.out.println(" El total de comision en esa semana es de :  " +nuevoSaldo);
                        int suma = 0;
                        
                        suma = suma +nuevoSaldo;
                        
                        System.out.println("La sumas es : " + suma);
                       
                        int opt;
                        do{
             
                        
                            System.out.println("1. Volver al menu principal");
                            System.out.print("Escoja Su Opcion ");
                            System.out.println("");
                            opt=teclado.nextInt();
                        
                            switch(opt){
                                
                                case 1:
                                 break;
                                
                            }
                                 break;
                        }while(opt != 1);
                        
                       break; 
                case 2:
                    
                    System.out.println("Categoria B");
                    System.out.println("Ingrese cuantos datos desea ingresar : ");
                    limA = entrada.nextInt();
                    for (int i = 1; i <= limA; i++) {
            
                        System.out.println("Ingrese el monto vendido del vendedor : ");
                        arregloB[i] = ventas.nextInt();
                        
                    }
                    
                    for (int i = 1; i <arregloB.length; i++) {
             
                                if(arregloB[i] > 5000){
                 
                                     nuevoSaldo1 =  (arregloB[i]*7)/100 + 200; 
                 
                                        if(arregloB[i] >= 10000 &&  arregloB[i] <= 15000){
                     
                                            nuevoSaldo1 = (arregloB[i]*10)/100+200;
                     
                                                if (arregloB[i] > 15000) {
                         
                                                    nuevoSaldo1 = (arregloB[i]*13)/100+200;
                                                }
                                        } 
                                }
                        }
                        System.out.println(" El total de comision en esa semana es de :  " +nuevoSaldo1);
                    
                    for (int i = 0; i < arregloB.length; i++) {
                        
                    }
    
            
            }
            
            
            
            
        }while(op !=3);
       
     
     }
    
}
