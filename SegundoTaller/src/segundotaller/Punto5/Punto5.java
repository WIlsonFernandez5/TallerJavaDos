
package segundotaller.Punto5;


public class Punto5 {
    
    
    
    public static void main(String args[]) {
		int colum;
		int j;
		int matriz[][];
		matriz = new int[5][4];
		matriz[0][0] = 194;
		matriz[0][1] = 48;
		matriz[0][2] = 206;
		matriz[0][3] = 45;
		matriz[1][0] = 180;
		matriz[1][1] = 20;
		matriz[1][2] = 320;
		matriz[1][3] = 16;
		matriz[2][0] = 221;
		matriz[2][1] = 90;
		matriz[2][2] = 140;
		matriz[2][3] = 20;
		matriz[3][0] = 432;
		matriz[3][1] = 50;
		matriz[3][2] = 821;
		matriz[3][3] = 14;
		matriz[4][0] = 820;
		matriz[4][1] = 61;
		matriz[4][2] = 946;
		matriz[4][3] = 18;
		colum = 0;int suma = 0;
                double suma2 = 0, suma3 = 0, suma4 = 0, suma5 = 0; 
                double porcentaje = 0, porcentaje2 = 0, porcentaje3 = 0, porcentaje4 = 0;
		System.out.println("Columna   "+"Candidato A   "+"Candidato B   "+"Candidato C   "+"Candidato D   ");
		for (j=1;j<=5;j++) { 
                    
			colum = colum+1;
			System.out.println("   "+colum+"         "+matriz[j-1][0]+"           "+matriz[j-1][1]+"            "+matriz[j-1][2]+"             "+matriz[j-1][3]);
                   
                        
                        suma += matriz[j -1 ][0] ;
                        suma2 += matriz[j - 1][1];
                        suma3 += matriz[j - 1][2];
                        suma4 += matriz[j - 1][3];
                        
                        porcentaje = suma;
                        porcentaje2 = suma2;
                        porcentaje3 = suma3;
                        porcentaje4 = suma4;
 
                      
                    
		}
                System.out.println("\n" );

                    System.out.println(" LA SUMA DE LOS VOTOS DEL CANDIDATO A ES DE : "+suma);
                    System.out.println(" LA SUMA DE LOS VOTOS DEL CANDIDATO B ES DE : "+suma2);
                    System.out.println(" LA SUMA DE LOS VOTOS DEL CANDIDATO C ES DE : "+suma3);
                    System.out.println(" LA SUMA DE LOS VOTOS DEL CANDIDATO D ES DE : "+suma4);
                    
                      porcentaje = porcentaje/100;
                      porcentaje2 = porcentaje2/100;
                      porcentaje3 = porcentaje3/100;
                      porcentaje4 = porcentaje4/100;
      
                    System.out.printf("%n EL PORCENTAJE DE VOTACIONES DEL CANTIDATO A ES DE : %.2f", porcentaje );
                    System.out.printf("%n EL PORCENTAJE DE VOTACIONES DEL CANTIDATO B ES DE : %.2f", porcentaje2 );
                    System.out.printf("%n EL PORCENTAJE DE VOTACIONES DEL CANTIDATO C ES DE : %.2f", porcentaje3 );
                    System.out.printf("%n EL PORCENTAJE DE VOTACIONES DEL CANTIDATO D ES DE : %.2f", porcentaje4 );
                    System.out.println("\n" );
                
                    for (int y = 0; y < matriz.length; y++) {
                        int sumas = 0;
                        for (int x = 0; x < matriz[y].length; x++) {
                             System.out.printf("%d ", matriz[y][x]);
                             sumas += matriz[y][x];
                         }
                        System.out.printf("= %d\n", sumas);
                        
                    }   System.out.println("LA COMUNA QUE MAS PORCENTAJE DE VOTACION TUVO FUE LA 5");
           
	}

    
           
    
}
