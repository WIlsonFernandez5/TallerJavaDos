
package segundotaller.Punto4;

import java.util.Scanner;


public class Punto4 {
    
    public static void main(String[] args) {
        
        
        
        Scanner entrada = new Scanner(System.in);
    
        int conta = 0, horas = 0;
        double tarifa, sueldo;
        
        while( conta <= 5){
            
            System.out.println("Ingrese las horas trabajadas de los empleados" + (conta + 1) + " : ");
            horas = entrada.nextInt();
            
            System.out.println("La tarifa por hora es : ");
            tarifa = entrada.nextDouble();
            
            if ( horas <= 40){
                
                sueldo = horas * tarifa;
                
            }else{
                
                sueldo = (40 * tarifa) + (horas-40) * (tarifa*1.5);
                
            }
            
            System.out.println(" El sueldo del empleado " + (conta + 1) + " es : " +sueldo);
        }
    
 
    
    }
    
    
}
