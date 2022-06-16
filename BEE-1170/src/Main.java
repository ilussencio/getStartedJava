import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        double vet[] = new double[n];
        int dias = 0;

        for(int i = 0; i < n; i++)
            vet[i] = s.nextDouble();

        for(int i = 0; i < n; i++){
            while(vet[i] > 1.0){
                vet[i] = vet[i] / 2;
                dias ++;
            }
            
            System.out.println(dias+" dias");
            dias = 0;
        }
    }
}
