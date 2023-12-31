package taller_10;
import java.util.Scanner;
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String nomProductos[] = {"Gaseosas", "Picaditas", "Alcohol ", "Alinios ", "Granos secos", "Embutidos"};
        int limProductos = 6;
        int columnas = 2;
        double matPreCan[][] = new double[limProductos][columnas];
        for (int i = 0; i < limProductos; i++) {
            //Aquí ingrese los precios señor emprendedor
            matPreCan[0][0] = 1;
            matPreCan[1][0] = 0.50;
            matPreCan[2][0] = 2.50;
            matPreCan[3][0] = 0.50;
            matPreCan[4][0] = 0.75;
            matPreCan[5][0] = 1.50;
            for (int j = 0; j < columnas; j++) {
                //Aquí ingrese la cantidad de los productos señor emprededor
                matPreCan[0][1] = 100;
                matPreCan[1][1] = 10;
                matPreCan[2][1] = 50;
                matPreCan[3][1] = 50;
                matPreCan[4][1] = 75;
                matPreCan[5][1] = 80;
            }
        }
        System.out.println("¿Que producto busca?");
        nombre = teclado.nextLine().toUpperCase();
        for (String buscar : nomProductos) {
            if (buscar.toUpperCase().startsWith(nombre)) {
                System.out.println("Si tenemos este producto, aquí tienes nuestro catálogo:");
                    System.out.println("Producto        |Precio  | Cantidad");
                    System.out.println("===================================");
                    for (int i = 0; i < limProductos; i++) {
                        System.out.printf(nomProductos[i] + "\t");
                        for (int j = 0; j < columnas; j++) {
                            System.out.printf("| %.2f \t", matPreCan[i][j]);
                        }
                        System.out.println("");
                    }
                    break;
                }
            }
        }
    }
/*POR FM Y JP MI profeeeeeee
¿Que producto busca?
Gaseosa
Si tenemos este producto, aquí tienes nuestro catálogo: 
Producto        |Precio  | Cantidad
===================================
Gaseosas	| 1,00 	| 100,00 	
Picaditas	| 0,50 	| 10,00 	
Alcohol 	| 2,50 	| 50,00 	
Alinios 	| 0,50 	| 50,00 	
Granos secos	| 0,75 	| 75,00 	
Embutidos	| 1,50 	| 80,00*/