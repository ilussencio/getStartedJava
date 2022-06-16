import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int vet[] = new int[10];

        vet[0] = n;

        for(int i = 1; i < 10; i++){
            n = n * 2;

            vet[i] = n;
        }

        for(int i = 0; i < 10; i++){
            System.out.printf("N[%d] = %d\n",i,vet[i]);
        }
    }
}
