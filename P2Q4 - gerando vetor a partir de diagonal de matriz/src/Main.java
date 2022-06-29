import java.util.Scanner;

public class Main {
    public static void imprimirVetor(double vetor[]){
        String string = "{";
        for(int i = 0; i < vetor.length; i ++){
            string += vetor[i];
            if( i < vetor.length -1){
                string += ",";
            }
        }
        string += "}";
        System.out.println(string);
    }

    public static double[] diagonalPrincipal(double mat[][]){
        double vet[] = new double[mat[0].length];
        for(int i = 0; i < vet.length; i++){
            for(int j = 0; j < vet.length; j++){
                if( i == j){
                    vet[i] = mat[i][j];
                }
            }
        }
        return vet;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double mat[][] = new double[n][n];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                mat[i][j] = s.nextDouble();
            }
        }
        double vet[] = diagonalPrincipal(mat);

        imprimirVetor(vet);

    }
}