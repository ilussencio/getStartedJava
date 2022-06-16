import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int vet[] = new int[n];
        int pos = 0;

        for(int i = 0; i < n; i++)
            vet[i] = s.nextInt();
        
        for(int i = 0 ; i < n; i++){
            if(vet[i] < vet[pos]){
                pos = i;
            }
        }

        System.out.println("Menor valor: "+vet[pos]);
        System.out.println("Posicao: "+pos);
        

    }    
}
