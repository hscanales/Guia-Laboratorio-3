/*
 * 
 * 
 * 
 */
package guialabo3;

import java.util.Scanner;
        

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Array {
    
    
    int sumar(int[] array){
        int suma= 0;
        for(int i=0;i<array.length;i++){
            suma+=array[i];
        }
        
        return suma;
    }
    
    int medAritmetica(int[] array){
        int suma= 0,cont=0;
        
        for(int i=0;i<array.length;i++){
            suma+=array[i];
            cont+=1;
        }
        
        return suma/cont;
    }
    String[] pedir(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese los numeros enteros que quiera ingresar separados por una coma ',' , Presione Enter para terminar: ");
        String string=sc.nextLine();
        String[] partes= string.split(",");
        return partes;
    }


    Double[] toDouble(String[] array){
        Double[] temp = new Double[array.length];
  
            for(int i=0;i<array.length;i++){
            temp[i]= Double.parseDouble(array[i]);
        }

        return temp;
    }




}

 
