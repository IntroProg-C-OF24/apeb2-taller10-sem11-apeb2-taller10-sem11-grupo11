package taller_10;
public class ejercicio_8 {
    public static void main(String[] args) {
        int limMat = 3;
        int mat[][] = new int[limMat][limMat];
        for (int i = 0; i < limMat; i++) {
            for (int j = 0; j < limMat; j++) {
                mat[i][j] = (int) (Math.random() * (-9 - 9 + 1) + 9);
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < limMat; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j);
            }
        }
        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < limMat; i++) {
            System.out.println(mat[i][i] + "\t");
        }
        System.out.println("Elementos debajo de la diagonal Principal");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Elementos encima de la diagonal Principal");
        for (int j = 0; j < mat.length; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(mat[i][j]+ "\t");
            }
        }
    }
}
/*
Por JP y FM Mi PROFEEEEEEEE
0	-3	-3	
2	6	5	
-4	8	-6	
Diagonal Principal: 
0	
6	
-6	
Elementos debajo de la diagonal Principal

2	
-4	8	
Elementos encima de la diagonal Principal
-3	-3	5	
*/