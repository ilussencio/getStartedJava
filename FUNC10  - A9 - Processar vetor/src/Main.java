import java.util.Scanner;

public class Main {
    public static double maior(double vet[]){
        double maior = vet[0];
        for(int i = 1; i < vet.length; i++){
            if(vet[i] > maior)
                maior = vet[i];
        }
        return maior;
    }
    public static double menor(double vet[]){
        double menor = vet[0];
        for(int i = 0; i < vet.length; i++){
            if(vet[i] < menor)
                menor = vet[i];
        }
        return menor;
    }
    public static double media(double vet[]){
        double soma = 0;
        for(int i = 0; i < vet.length; i++)
            soma += vet[i];
        return soma/vet.length;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double vet[] = new double[n];

        for( int i = 0; i < n; i ++)
            vet[i] = s.nextDouble();
        
        System.out.printf("Maior : %.2f\n", maior(vet));
        System.out.printf("Menor : %.2f\n",menor(vet));
        System.out.printf("Media : %.2f\n",media(vet));
    }
}
