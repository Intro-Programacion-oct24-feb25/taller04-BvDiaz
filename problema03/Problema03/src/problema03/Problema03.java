/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = 1.5;
        double b = 50;
        String direccion;
        direccion = "Calle primera entre segunda y décima";
        String nombres;
        nombres = "Luis Alberto Carvajal Ludeña";
        double costoPlantilla;
        
        costoPlantilla = b * a;
        
        System.out.printf("Reporte: %s\nNombres completos:%s\n\tDireccion::%s\n"
                + "Costo por minuto: %.2f\n\t"
                + "Numero de minutos consumidos:%.2f\n\t\t"
                + "Valor a cancelar: %.2f",
                
                " ",
                nombres,
                direccion,
                a,
                b,
                costoPlantilla);
       
    }
    
}
