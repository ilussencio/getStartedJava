import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mat[][] = new int[n][n];
        int soma = 0;

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                mat[i][j] = s.nextInt();
            }
        }

        int l = s.nextInt();
        int c = s.nextInt();
        System.out.println("Matriz resultante:");
        for(int i = 0; i < l; i++){
            for (int j = 0; j < c; j++){
                System.out.printf("%d ",mat[i][j]);
                soma += mat[i][j];
            }
            System.out.println("");
        }
        System.out.println("Soma:");
        System.out.println(soma);
    }
}