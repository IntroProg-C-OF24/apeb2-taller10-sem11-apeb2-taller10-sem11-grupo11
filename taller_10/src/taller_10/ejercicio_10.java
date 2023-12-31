package taller_10;
import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de la figura: ");
        int tamaño = teclado.nextInt();
        for (int i = 0; i <= tamaño; i++) {
            for (int j = tamaño-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int i = 0; i <= tamaño; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = tamaño - i - 1; k > 0; k--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
/*
Por FM Y JP mi PROFEEEEEEEE
Ingrese el tamaño de la figura: 
7
       
       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 * * * * * * *
  * * * * * *
   * * * * *
    * * * *
     * * *
      * *
       *
*/