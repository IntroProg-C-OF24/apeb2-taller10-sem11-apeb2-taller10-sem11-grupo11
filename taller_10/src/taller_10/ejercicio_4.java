package taller_10;
import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args) {
        char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        boolean juegoEnCurso = true;
        char jugadorActual = 'X';
        System.out.println("Bienvenidos al juego de 3 en raya: Diviertete ñaño");
        while (juegoEnCurso) {
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
            Scanner scanner = new Scanner(System.in);
            int fila, columna;
            do {
                System.out.println("Jugador " + jugadorActual + ", ingrese fila (0-2) y columna (0-2) separadas por espacio:");
                fila = scanner.nextInt();
                columna = scanner.nextInt();
            } while (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ');
            tablero[fila][columna] = jugadorActual;
            for (int i = 0; i < 3; i++) {
                if ((tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual)
                        || (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)) {
                    juegoEnCurso = false;
                    break;
                }
            }
            if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual)
                    || (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
                juegoEnCurso = false;
                System.out.println("Alguien ganó, que bien ñaño");
            }
            boolean empate = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] == ' ') {
                        empate = false;
                        break;
                    }
                }
                if (!empate) {
                    break;
                }
            }
            if (empate) {
                juegoEnCurso = false;
                System.out.println("Nadie a ganado, jueguen unita más");
            }
            if (jugadorActual == 'X') {
                jugadorActual = 'O';
            } else {
                jugadorActual = 'X';
            }
        }
    }
}
/* POR FM Y JP MI PROFEEEEEEEEEEEEEEEEE
Bienvenidos al juego de 3 en raya: Diviertete ñaño
-------------
|   |   |   | 
-------------
|   |   |   | 
-------------
|   |   |   | 
-------------
Jugador X, ingrese fila (0-2) y columna (0-2) separadas por espacio:
1 0
-------------
|   |   |   | 
-------------
| X |   |   | 
-------------
|   |   |   | 
-------------
Jugador O, ingrese fila (0-2) y columna (0-2) separadas por espacio:
1 1
-------------
|   |   |   | 
-------------
| X | O |   | 
-------------
|   |   |   | 
-------------
Jugador X, ingrese fila (0-2) y columna (0-2) separadas por espacio:
2 0
-------------
|   |   |   | 
-------------
| X | O |   | 
-------------
| X |   |   | 
-------------
Jugador O, ingrese fila (0-2) y columna (0-2) separadas por espacio:
0 0
-------------
| O |   |   | 
-------------
| X | O |   | 
-------------
| X |   |   | 
-------------
Jugador X, ingrese fila (0-2) y columna (0-2) separadas por espacio:
2 2
-------------
| O |   |   | 
-------------
| X | O |   | 
-------------
| X |   | X | 
-------------
Jugador O, ingrese fila (0-2) y columna (0-2) separadas por espacio:
2 1
-------------
| O |   |   | 
-------------
| X | O |   | 
-------------
| X | O | X | 
-------------
Jugador X, ingrese fila (0-2) y columna (0-2) separadas por espacio:
0 1
-------------
| O | X |   | 
-------------
| X | O |   | 
-------------
| X | O | X | 
-------------
Jugador O, ingrese fila (0-2) y columna (0-2) separadas por espacio:
0 2
-------------
| O | X | O | 
-------------
| X | O |   | 
-------------
| X | O | X | 
-------------
Jugador X, ingrese fila (0-2) y columna (0-2) separadas por espacio:
1 2
Nadie a ganado, jueguen unita más
*/
