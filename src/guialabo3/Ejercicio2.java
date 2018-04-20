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
public class Ejercicio2 {
    int n;
    
    public Ejercicio2() {
    }
    String[] start(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese los numeros enteros que quiera ingresar separados por una coma ',': ");
        String string=sc.nextLine();
        String[] partes= string.split(",");
        return partes;
    }
}
