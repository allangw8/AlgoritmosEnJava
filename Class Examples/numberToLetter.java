/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Algoritmo que muestra los numeros en letras del 0 al 10

*/

public class numberToLetter {   

   public static void main(String[] args) {

    //usando ifs
   		int x =0;
    	for(x = 0; x< 3 ; x++)
    	{
    			if (x == 0) {
    				System.out.println("Cero");
    			}
    			if(x == 1){
    				System.out.println("Uno");
    			}



    	}


   	//usando switch
    	x = 0;

    	    	for(x = 0; x< 3 ; x++)
    	{
    	switch(x)
    	{
    		case 0:
    				System.out.println("Cero");
    				break;
    		case 1:
    				  System.out.println("Uno");
    				  break;
    		default:
    				break;

    	}
    }

   }

}