/*
 * 
 * 
 * 
 */
package guialabo3;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Ejercicio3 extends Array {

    public Ejercicio3() {
    }

    void start() {
        String[] array3 = pedir();
        System.out.print(Arrays.toString(array3));
        ArrayUtils.reverse(array3);
        System.out.print(Arrays.toString(array3));
    }

}
