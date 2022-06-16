import java.util.Scanner;

public class Main {
    public static void main(String[] Args){
        Scanner s = new Scanner(System.in);
        double vet[] = new double[100];
        for(int i = 0; i < 100; i++){
            vet[i] = s.nextDouble();
        }

        for(int i = 0; i < 100; i++){
            if(vet[i] <= 10)
                System.out.printf("A[%d] = %.1f\n",i,vet[i]);
        }
    }
}
