import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double maior,n;
        int posicao = 0;
        int quant = s.nextInt();
        double vet[] = new double[quant];

        for (int i = 0; i < quant; i ++){
            vet[i] = s.nextDouble();
        }
        

        n = s.nextDouble();
        maior = -1000000;
        
        for(int i = 0; i < quant; i ++){
            if(vet[i] > maior && vet[i] < n)
                maior = vet[i];
                posicao = i;
        }
        if(maior == -1000000){
            System.out.println("Não existe elementos menores que X.");
        }else{
            System.out.println(posicao);
            System.out.println(maior);
        }


    }
}
