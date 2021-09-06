/* Desarrolle una aplicación en Java que determine si alguno de los clientes de una tienda de departamentos se ha 
excedido del límite de crédito en una cuenta. Para cada cliente se tienen los siguientes datos: 
a) el saldo al inicio del mes.
b) el total de abonos en el mes.
c) el total de créditos aplicados a la cuenta del cliente en el mes.
d) el límite de crédito permitido.
El programa debe contar con estos datos cargados en variables de tipo entera, y debe calcular el nuevo saldo (= saldo 
inicial + abonos - créditos), mostrar el nuevo balance y determinar si éste excede el límite de crédito del cliente. 
Para los clientes cuyo límite de crédito sea excedido, el programa debe mostrar el mensaje "Se excedió el límite de su 
crédito”.*/

package segundotaller.Punto2;

import java.util.Scanner;


public class Punto2 {
    
    
    
    public static void main(String[] args) {
    
        int numeroCuenta;               
        double saldoInicio;               
        double abonos;               
        double totalCreditosMes;               
        double limiteCredito; 
        
        double nuevoSaldo = 0;
        
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Por favor introduzca el numero de cuenta del cliente : ");   
        numeroCuenta = entrada.nextInt(); 
        
        System.out.println("Por favor introduzca el saldoInicial: ");           
        saldoInicio = entrada.nextDouble();              
                
        System.out.println("Por favor introduzca los abonos hechos por el cliente: ");       
        abonos = entrada.nextDouble();              
                
        System.out.println("Por favor introduzca el total de los creditos del mes por el cliente : ");        
        totalCreditosMes = entrada.nextDouble();              

        System.out.println("Por favor introduzca el limite de credito para el cliente: ");      
        limiteCredito = entrada.nextDouble();              
                
      
        
        nuevoSaldo = saldoInicio + abonos - totalCreditosMes;
        
        if( totalCreditosMes > limiteCredito){
            
            System.out.println(" El cliente ha exedido el limite de creditos otorgados ");
        }else{
            
            System.out.println("El cliente no ha exedido el limite de creditos otorgados ");
        }
        
        System.out.println(" El nuevo saldo es de : " +nuevoSaldo);
        
    }
}
