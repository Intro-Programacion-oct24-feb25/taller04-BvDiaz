/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Ingreso de valores por teclado
         
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        System.out.println("Ingrese base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese altura del triangulo");
        altura = entrada.nextDouble();
        
        area = (base * altura)/2;
        
        System.out.println("Area=" + area);
                
        
    }
    
}
