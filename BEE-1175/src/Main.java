import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int vet[] = new int[20];
        int aux;

        for(int i = 0; i < 20; i++){
            vet[i] = s.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
            aux = vet[i];
            vet[i] = vet[19-i];
            vet[19-i] = aux;
        }

        for(int i = 0; i < 20; i++){
            System.out.printf("N[%d] = %d\n",i,vet[i]); 
        }
    }
}
