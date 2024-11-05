/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double gastosHijo1;
        double gastosHijo2;
        double gastosHijo3;
        double gastoTotal;
        
        System.out.println("Ingrese los gastos del hijo 1");
        gastosHijo1 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del hijo 2");
        gastosHijo2 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del hijo 3");
        gastosHijo3 = entrada.nextDouble();
        
        gastoTotal = gastosHijo1 + gastosHijo2 + gastosHijo3;
        
        System.out.printf("Gastos hijo 1: %.2f\nGastos hijo 2:%.2f\n"
                + "Gastos Hijo 3:%.2f\nGastos Totales:%.2f",
                
        gastosHijo1,
        gastosHijo2,
        gastosHijo3,
        gastoTotal);
        
    }
    
}
