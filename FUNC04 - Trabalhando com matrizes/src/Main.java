import java.util.Scanner;

public class Main {
    public static void imprimeMatriz(int mat[][]){
        System.out.println();
        System.out.print("{");
        for(int i = 0; i < mat.length; i ++){
            System.out.print("{");
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j]);
                if(j < mat[0].length-1){
                    System.out.print(",");
                }
            }
            System.out.print("}");
        }
        System.out.print("}");

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lin = s.nextInt();
        int col = s.nextInt();
        int mat[][] = new int[lin][col];

        for(int i = 0 ; i < lin; i++){
            for(int j = 0; j < col; j++){
                mat[i][j] = s.nextInt();
            }
        }

        imprimeMatriz(mat);

    }
}