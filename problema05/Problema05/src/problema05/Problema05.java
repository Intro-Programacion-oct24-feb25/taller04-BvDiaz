/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double netflix;
        double youtubePremium;
        double dropbox;
        double spotify;
        double descuentoNetflix;
        double descuentoYoutubeP;
        double descuentoDropbox;
        double costoTotal;
        
        System.out.println("Ingrese valor de netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese valor de youtube Premium");
        youtubePremium = entrada.nextDouble();
        System.out.println("Ingrese valor de dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese valor de spotify");
        spotify = entrada.nextDouble();
                
        descuentoNetflix = (netflix * 77)/100;
        descuentoYoutubeP = (youtubePremium * 77)/100;
        descuentoDropbox = (dropbox * 55)/100;
        
        costoTotal = descuentoNetflix + descuentoYoutubeP + descuentoDropbox + 
                spotify;
        
        System.out.printf("Reporte: %s\nValor netflix: %.2f\n"
                + "Valor YoutubePremium:%.2f\nValor Dropbox:%.2f\n"
                + "Valor Spotify:%.2f\nValor descuento de netflix: %.2f\n"
                + "Valor descuento de Youtube Premium:%.2f\n"
                + "Valor descuento Dropbox: %.2f\nPago mensual:%.2f",
                
                " ",
                netflix,
                youtubePremium,
                dropbox,
                spotify,
                descuentoNetflix,
                descuentoYoutubeP,
                descuentoDropbox,
                costoTotal);
                
    }
    
}
