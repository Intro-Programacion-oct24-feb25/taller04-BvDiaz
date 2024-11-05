/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cpu = 600;
        double teclado = 20;
        double raton = 15;
        double pantalla = 300;
        double costoTotal;
        String nombreUsuario;
        nombreUsuario = "Luis Alberto Carvajal Ludeña";
        
        costoTotal = cpu + teclado + raton + pantalla;
        
        System.out.printf("Reporte: %s\nNombre de cliente:%s\nValores Iniciales:"
                + "%s\nCPU:%.2f\nTeclado:%.2f\nRaton:%.2f\nPantalla:%.2f\n"
                + "Valor a cancelar:%.2f\n",
                
                " ",
                nombreUsuario,
                " ",
                cpu,
                teclado,
                raton,
                pantalla,
                costoTotal);
        
        
    }
    
}
