import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        double vet[] = new double[n];

        for(int i = 0; i < n; i ++)
            vet[i] = s.nextDouble();

        double valor = s.nextDouble();

        for(int i = 0; i < n; i++){
            if(vet[i] > valor){
                System.out.printf("%.1f\n", vet[i]);
            }
        }
    }
}
