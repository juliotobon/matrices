package llenadomatrices;

import java.util.Random;
import java.util.Scanner;

public class Matriz {
	
	public static boolean verifica (int matriz[][],int filas, int columnas, int aux) {
		
		for(int i=0; i<filas; i++) {
			for(int j=0; i<columnas; i++) {
				
				if(aux== matriz[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main (String args[]) {
		
		//int matriz [][];
		int filas,columnas, aux;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el numero de filas que quiere para su matriz");
		filas= (entrada.nextInt());
		System.out.println("ingrese el numero de filas que quiere para su matriz");
		columnas= (entrada.nextInt());
		int [][]matriz= new int [filas][columnas];
		Random rnd=new Random();
		
		
		
		for (int i=0; i<filas; i++) {
			
			for(int j=0; j<columnas; j++){
			
				aux=  rnd.nextInt(25);
				while (verifica ( matriz,  filas,  columnas, aux)==false ){
					
					aux=  1+rnd.nextInt(25);
				}
				matriz [i][j]= aux;
		}
	}
	      for (int i=0; i<filas; i++) {
			
		     for(int j=0; j<columnas; j++){
				
				System.out.print(matriz[i][j]+"\t");
			}
		     System.out.println("\n");
	   }
				
  }

}
