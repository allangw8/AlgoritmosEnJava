/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Algoritmo recibe cierta cantidad de numeros y devuelve el promedio entre ellos

*/

public class numberAverage {   

   public static void main(String[] args) {

   	  int resultado = 0;

   	  int limite = Integer.parseInt(args[0].toString());

      for(int x = 0; x< limite;x++)
      {
      		resultado = resultado + x;
      }
	resultado = resultado / limite;

	System.out.println(resultado);
   }

}