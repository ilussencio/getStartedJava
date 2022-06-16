import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int vet[] = new int[1000];
        int j = 0;
        for(int i = 0; i < 1000; i++){
            vet[i] = j;
            j++;
            if(j == n){
                j = 0;
            }
        }

        for(int i = 0; i < 1000; i++){
            System.out.printf("N[%d] = %d\n",i,vet[i]);
        }
    }
}
