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
public class Menu {
    Auxiliar hc= new Auxiliar();
    Scanner sc= new Scanner(System.in);
    public Menu() {
    }
    

    void deploy() {
     System.out.println();
     System.out.println("Menu Laboratorio 3");
     for(int i=1;i<23;i++){
         System.out.println(i+"- Ejercicio "+i);
     }
     System.out.println("0- Salir");
     System.out.println("Eliga una opcion: ");
    }
    
    void start(){
        int opcion;
        boolean flag= true;
        while(flag){
            deploy();
            opcion= sc.nextInt();
            switch(opcion){
                case 0:
                    flag=false;
                    break;
                case 1: 
                    Ejercicio1 ejercicio1=new Ejercicio1();
                    hc.print("El Array es: ");
                    hc.print(ejercicio1.array1);
                    hc.print("La suma del Arreglo es: ");
                    hc.print(ejercicio1.sumar(ejercicio1.array1));
                    break;
                case 2:
                    Ejercicio2 ejercicio2= new Ejercicio2();
                    hc.print(ejercicio2.start());
                    break;
                case 3:
                    Ejercicio3 ejercicio3= new Ejercicio3();
                    ejercicio3.start();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                case 21:
                    break;
                case 22:
                    break;
            }
        }
    }
}
