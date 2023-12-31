package taller_10;
public class ejercicio_1 {
    public static void main(String[] args) {
        int limEst = 28, limNotas = 3;
        double matNotas[][] = new double[limEst][limNotas];
        double arrProm[] = new double[limEst];
        double promedio = 0, sumaPro = 0, notaMax, notaMin;
        for (int i = 0; i < limEst; i++) {
            for (int j = 0; j < limNotas; j++) {
                matNotas[i][j] = (double) (Math.random() * (9 - 0 + 1) + 0);
            }
        }
        for (int i = 0; i < limEst; i++) {
            arrProm[i] = (matNotas[i][0] * 0.35) + (matNotas[i][1] * 0.35) + (matNotas[i][2] * 0.35);
            sumaPro += arrProm[i];
            promedio = (sumaPro / limEst);
        }
        System.out.println("Nombres | ACD | APE | AA | Promedio");
        for (int i = 0; i < limEst; i++) {
            System.out.printf("Estudiante " + i + "\t");
            for (int j = 0; j < limNotas; j++) {
                System.out.printf("| %.2f \t", matNotas[i][j]);
            }
            System.out.printf("| %.2f \t", arrProm[i]);
            System.out.println("");
        }
        System.out.println("Promedio: ");
        System.out.printf("%.2f ", promedio);
        System.out.println("");
        System.out.println("Estudiantes encima del promedio");
        System.out.println("");
        for (int i = 0; i < limEst; i++) {
            if (arrProm[i] > promedio) {
                System.out.printf("Estudiante " + i + "\t");
                System.out.printf("| %.2f \t", arrProm[i]);
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("Estudiantes debajo del promedio");
        System.out.println("");
        for (int i = 0; i < limEst; i++) {
            if (arrProm[i] < promedio) {
                System.out.printf("Estudiante " + i + "\t");
                System.out.printf("| %.2f \t", arrProm[i]);
                System.out.println("");
            }
        }
        notaMax=arrProm[0];
        notaMin=arrProm[0];
        for (int i = 0; i < limEst; i++) {
            if (arrProm[i]>notaMax){
                notaMax = arrProm[i];
            }
            if (arrProm[i]<notaMin){
                notaMin = arrProm[i];
            }
        }
        System.out.println("");
        System.out.println("Estudiante con la nota Mayor: ");
        System.out.printf("%.2f ", notaMax);
        System.out.println("");
        System.out.println("Estudiante con la nota Menor: ");
        System.out.printf("%.2f ", notaMin);
    }
}
/*
POR FM Y JP MI PROFEEEEEE
Nombres | ACD | APE | AA | Promedio
Estudiante 0	| 0,90 	| 1,48 	| 2,57 	| 1,73 	
Estudiante 1	| 7,34 	| 9,00 	| 9,58 	| 9,08 	
Estudiante 2	| 1,06 	| 0,32 	| 0,54 	| 0,67 	
Estudiante 3	| 7,98 	| 1,41 	| 5,07 	| 5,06 	
Estudiante 4	| 3,42 	| 0,37 	| 7,92 	| 4,10 	
Estudiante 5	| 3,31 	| 4,61 	| 8,53 	| 5,76 	
Estudiante 6	| 5,55 	| 6,51 	| 5,56 	| 6,17 	
Estudiante 7	| 9,44 	| 6,80 	| 5,41 	| 7,57 	
Estudiante 8	| 9,24 	| 2,17 	| 6,99 	| 6,44 	
Estudiante 9	| 8,94 	| 4,25 	| 0,13 	| 4,66 	
Estudiante 10	| 1,71 	| 4,39 	| 8,06 	| 4,96 	
Estudiante 11	| 9,01 	| 7,75 	| 1,04 	| 6,23 	
Estudiante 12	| 1,53 	| 9,98 	| 3,66 	| 5,31 	
Estudiante 13	| 0,82 	| 9,53 	| 3,13 	| 4,72 	
Estudiante 14	| 8,94 	| 0,87 	| 7,80 	| 6,16 	
Estudiante 15	| 5,77 	| 1,67 	| 4,17 	| 4,06 	
Estudiante 16	| 4,68 	| 6,33 	| 2,49 	| 4,72 	
Estudiante 17	| 6,87 	| 7,29 	| 5,14 	| 6,76 	
Estudiante 18	| 9,39 	| 2,94 	| 5,71 	| 6,32 	
Estudiante 19	| 9,61 	| 1,83 	| 9,27 	| 7,25 	
Estudiante 20	| 5,47 	| 2,89 	| 4,34 	| 4,44 	
Estudiante 21	| 7,52 	| 8,20 	| 1,88 	| 6,16 	
Estudiante 22	| 9,77 	| 2,07 	| 2,47 	| 5,01 	
Estudiante 23	| 2,49 	| 9,66 	| 6,91 	| 6,67 	
Estudiante 24	| 2,42 	| 7,68 	| 4,60 	| 5,14 	
Estudiante 25	| 8,20 	| 9,17 	| 6,19 	| 8,25 	
Estudiante 26	| 0,55 	| 3,44 	| 1,47 	| 1,91 	
Estudiante 27	| 8,48 	| 8,04 	| 2,63 	| 6,71 	
Promedio: 
5,43 
Estudiantes encima del promedio
Estudiante 1	| 9,08 	
Estudiante 5	| 5,76 	
Estudiante 6	| 6,17 	
Estudiante 7	| 7,57 	
Estudiante 8	| 6,44 	
Estudiante 11	| 6,23 	
Estudiante 14	| 6,16 	
Estudiante 17	| 6,76 	
Estudiante 18	| 6,32 	
Estudiante 19	| 7,25 	
Estudiante 21	| 6,16 	
Estudiante 23	| 6,67 	
Estudiante 25	| 8,25 	
Estudiante 27	| 6,71 	
Estudiantes debajo del promedio
Estudiante 0	| 1,73 	
Estudiante 2	| 0,67 	
Estudiante 3	| 5,06 	
Estudiante 4	| 4,10 	
Estudiante 9	| 4,66 	
Estudiante 10	| 4,96 	
Estudiante 12	| 5,31 	
Estudiante 13	| 4,72 	
Estudiante 15	| 4,06 	
Estudiante 16	| 4,72 	
Estudiante 20	| 4,44 	
Estudiante 22	| 5,01 	
Estudiante 24	| 5,14 	
Estudiante 26	| 1,91 	
Estudiante con la nota Mayor: 
9,08 
Estudiante con la nota Menor: 
0,67*/