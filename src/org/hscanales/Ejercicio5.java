/*
 * 
 * 
 * 
 */
package org.hscanales;

import java.util.Arrays;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Ejercicio5 extends Array {

    public Ejercicio5() {
    }
    
    void start(){
        String[] array=pedir();
    Double[] fixed=toDouble(array);
        System.out.println("Arreglo sin ser ordenado");
        System.out.println(Arrays.toString(fixed));
        System.out.println("Arreglo ordenado de menor a Mayor: ");
        Arrays.sort(fixed);
        System.out.println(Arrays.toString(fixed));
    }
}
