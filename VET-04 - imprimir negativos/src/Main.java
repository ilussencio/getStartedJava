import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int quant = s.nextInt();
        int vet[] = new int[quant];

        for( int i = 0; i < quant; i++){
            vet[i] = s.nextInt();
        }

        for(int i = quant-1; i >= 0; i --){
            if(vet[i] < 0)
                System.out.println(vet[i]);
        }


    }
}
