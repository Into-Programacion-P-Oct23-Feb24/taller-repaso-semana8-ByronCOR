/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
      
        int suma = 0;
        int contador = 1;
        String cadena = "";
        System.out.println("Ingrese un numero");
        n = entrada.nextInt();
        if (n > 0) {
            if (n % 2 == 0) {
                while (contador <= n) {
                    
                    suma = suma +1;
                    contador = contador + 1;
                    cadena = String.format("%s %d ", cadena, suma);
                }
                System.out.printf("%s", cadena);
            } else {
                System.out.println("ERROR");
            }
        }
    }

}
