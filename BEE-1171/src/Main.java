import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int vet[] = new int[n];
        int count = 0;
        boolean rept = false;

        for(int i = 0; i < n; i++){
            vet[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(vet[i] == vet[j]){
                    count ++;                    
                }
            }

            for(int j = 0; j < i; j++){
                if( vet[i] == vet[j]){
                    rept = true;
                }
            }

            if(rept == false){
                System.out.printf("%d aparece %d vez(es)\n",vet[i],count);
            }
            
            count = 0;
            rept = false;
        }
    }
}
