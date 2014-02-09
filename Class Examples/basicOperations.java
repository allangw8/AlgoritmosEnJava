/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Algoritmo que recibe 2 enteros, los suma, resta, multiplca y divide.

*/

public class basicOperations {   

   public static void main(String[] args) {

   		int num1, num2;
		

	  num1 = Integer.parseInt(args[0].toString());
      
      num2 = Integer.parseInt(args[1].toString());


      System.out.println(num1+num2);

      System.out.println(num1-num2);

      System.out.println(num1*num2);

      System.out.println(num1/num2);
   }

}