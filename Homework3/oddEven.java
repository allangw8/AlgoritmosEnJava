/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven{

     public static void main(String[] args){

	int num1;
	num1 = Integer.parseInt(args[0].toString());

	if(num1%2==0){
	System.out.println("par");
	}
		else{
	System.out.println("impar");
}
}
}