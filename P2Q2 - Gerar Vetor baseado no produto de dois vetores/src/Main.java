import java.util.Scanner;

public class Main
{
    public static void imprimeVetor(int vet[]){
        String string = "{";
        for(int i = 0; i < vet.length;i++){
            string += vet[i];
            if(i != vet.length-1){
                string += ",";
            }
        }
        string += "}";
        System.out.println(string);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int vet1[] = new int[n];
        int vet2[] = new int[n];
        int soma[] = new int[n];

        for(int i = 0; i < n; i++)
            vet1[i] = s.nextInt();

        for(int i = 0; i < n; i++)
            vet2[i] = s.nextInt();

        for(int i = 0; i < n; i++)
            soma[i] = vet1[i] * vet2[i];

        imprimeVetor(soma);
    }
}


