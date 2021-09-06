
package segundotaller.Punto9;

import java.util.Scanner;


public class Punto9 {
     
    public static void main(String args[]){
    
        float costo;
        float monto_total = 0;
        int numero_producto;
        int cantidad_vendida;
        int op;
    
        Scanner teclado = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        do{
            
            System.out.print("\nEste almacen vende cinco productos con los siguientes");
            System.out.println("precios:");
            System.out.println("Producto 1: $2.98");
            System.out.println("Producto 2: $4.50");
            System.out.println("Producto 3: $9.98");
            System.out.println("Producto 4: $4.49");
            System.out.println("Producto 5: $6.87");
            System.out.println("6. TOTAL ");
             
            System.out.print("Escoja Su Opcion ");
            System.out.println("");
            op=teclado.nextInt();
             
            switch(op){
            
                
                case 1:
                       System.out.println("Producto 1 : 2.98");
                       System.out.println("Ingrese la cantidad vendida de este producto :");
                       cantidad_vendida = entrada.nextInt();
                       
                       System.out.printf("\nPrecio de esta venta es de : %f", cantidad_vendida*2.98);
                       monto_total += cantidad_vendida*2.98;
                        int opt;
                        do{
          
                            System.out.println("\n1. Volver al menu principal");
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
                    
                     System.out.println("Producto 2 : 4.50");
                     System.out.println("Ingrese la cantidad vendida de este producto :");
                     cantidad_vendida = entrada.nextInt();
                       
                     System.out.printf("\nPrecio de esta venta es de : %f \n", cantidad_vendida*4.50);
                     monto_total += cantidad_vendida*4.50;
                     
                     int opt2;
                        do{
          
                            System.out.println("\n1. Volver al menu principal");
                            System.out.print("Escoja Su Opcion ");
                            System.out.println("");
                            opt2=teclado.nextInt();
                        
                            switch(opt2){
                                
                                case 1:
                                 break;
                                
                            }
                                 break;
                        }while(opt2 != 1);
                    
                     break;
                     
                case 3:
                    
                     System.out.println("Producto 3 : 9.98");
                     System.out.println("Ingrese la cantidad vendida de este producto :");
                     cantidad_vendida = entrada.nextInt();
                       
                     System.out.printf("\nPrecio de esta venta es de : %f", cantidad_vendida*9.98);
                     monto_total += cantidad_vendida*9.98;
                    
                    int opt3;
                        do{
          
                            System.out.println("\n1. Volver al menu principal");
                            System.out.print("Escoja Su Opcion ");
                            System.out.println("");
                            opt3=teclado.nextInt();
                        
                            switch(opt3){
                                
                                case 1:
                                 break;
                                
                            }
                                 break;
                        }while(opt3 != 1);
                    
                    
                    
                    break;
                    
                case 4:
                    
                     System.out.println("Producto 4 : 4.49");
                     System.out.println("Ingrese la cantidad vendida de este producto :");
                     cantidad_vendida = entrada.nextInt();
                       
                     System.out.printf("\nPrecio de esta venta es de : %f", cantidad_vendida*4.49);
                     monto_total += cantidad_vendida*4.49;
                    
                    int opt4;
                        do{
          
                            System.out.println("\n1. Volver al menu principal");
                            System.out.print("Escoja Su Opcion ");
                            System.out.println("");
                            opt4=teclado.nextInt();
                        
                            switch(opt4){
                                
                                case 1:
                                 break;
                                
                            }
                                 break;
                        }while(opt4 != 1);
                    
                    
                break;
                
                case 5:
                    
                     System.out.println("Producto 5 : 6.87 ");
                     System.out.println("Ingrese la cantidad vendida de este producto :");
                     cantidad_vendida = entrada.nextInt();
                       
                     System.out.printf("\nPrecio de esta venta es de : %f", cantidad_vendida*6.87);
                     monto_total += cantidad_vendida*6.87;
                    
                    
                     int opt5;
                        do{
          
                            System.out.println("1. Volver al menu principal");
                            System.out.print("Escoja Su Opcion ");
                            System.out.println("");
                            opt5=teclado.nextInt();
                        
                            switch(opt5){
                                
                                case 1:
                                 break;
                                
                            }
                                 break;
                        }while(opt5 != 1);
                    
                    
                    break;

                case 6:
                    
                    System.out.println(" TOTAL GENERAL ");

                    System.out.printf("\nLas ventas totales fueron: %f\n\n", monto_total);
                    
                    break;
                    

            }

        }while(op !=6);
        
          
        
    
    
    } 
    
    

}
