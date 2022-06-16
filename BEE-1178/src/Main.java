import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double n = s.nextDouble();
        double vet[] = new double[100];
        vet[0] = n;

        for(int i = 1; i < 100; i++){
            n = n / 2;
            vet[i] = n;
        }

        for(int i = 0; i < 100; i ++)
            System.out.printf("N[%d] = %.4f\n", i,vet[i]);
    }    
}
