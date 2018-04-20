/*
 * 
 * 
 * 
 */
package guialabo3;

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
    
}
