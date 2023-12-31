package taller_10;
import java.util.Scanner;
public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion;
        int limMatriz = 3;
        int primeraMat[][] = new int [limMatriz][limMatriz];
        int segundaMat[][] = new int [limMatriz][limMatriz];
        int solucion[][] = new int [limMatriz][limMatriz];
        for (int i = 0; i < limMatriz; i++) {
            for (int j = 0; j < limMatriz; j++) {
                primeraMat[i][j] = (int) (Math.random() * (-9 - 9 + 1) + 9);
            }
        }
        System.out.println("Primera Matriz: ");
        for (int i = 0; i < primeraMat.length; i++) {
            for (int j = 0; j < limMatriz; j++) {
                System.out.print(primeraMat[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < limMatriz; i++) {
            for (int j = 0; j < limMatriz; j++) {
                segundaMat[i][j] = (int) (Math.random() * (-9 - 9 + 1) + 9);
            }
        }
        System.out.println("Segunda Matriz: ");
        for (int i = 0; i < segundaMat.length; i++) {
            for (int j = 0; j < limMatriz; j++) {
                System.out.print(segundaMat[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Si desea sumar las matrices ingrese 1 ");
        System.out.println("Si desea restar las matrices ingrese 2 ");
        opcion = teclado.nextInt();
         switch (opcion){
            case 1:
                System.out.println("Resultado");
                for (int i = 0; i < solucion.length; i++) {
                    for (int j = 0; j < solucion.length; j++) {
                        solucion[i][j]=primeraMat[i][j]+segundaMat[i][j];
                        System.out.print(solucion[i][j] + "\t");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Resultado: ");
                for (int i = 0; i < solucion.length; i++) {
                    for (int j = 0; j < solucion.length; j++) {
                        solucion[i][j]=primeraMat[i][j]-segundaMat[i][j];
                        System.out.print(solucion[i][j] + "\t");
                    }
                    System.out.println("");
                }
                break;
         }
    }
}
/* Juan Pablo Landi
Primera Matriz: 
-2	0	-4	
-3	-5	4	
-2	-3	-5	
Segunda Matriz: 
-3	2	-2	
8	8	0	
-5	0	7	
Si desea sumar las matrices ingrese 1 
Si desea restar las matrices ingrese 2 
1
Resultado
-5	2	-6	
5	3	4	
-7	-3	2
======================================
Primera Matriz: 
4	6	0	
-6	8	7	
-5	-5	-1	
Segunda Matriz: 
-6	3	-7	
-1	-5	2	
-2	0	-4	
Si desea sumar las matrices ingrese 1 
Si desea restar las matrices ingrese 2 
2
Resultado: 
10	3	7	
-5	13	5	
-3	-5	3	*/