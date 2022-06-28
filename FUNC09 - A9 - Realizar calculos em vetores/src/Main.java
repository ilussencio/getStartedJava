import java.util.Scanner;

public class Main {
    public static String imprimirVetor(int vet[]){
        String string = "{";
        for(int i = 0; i < vet.length; i++){
            string += vet[i];
            if(i != vet.length-1)
                string += ", ";
        }
        string += "}";
        return string;
    }
    public static String soma(int vet1[], int vet2[]){
        String string = "{";
        for( int i = 0; i < vet1.length; i++){
            string += vet1[i] + vet2[i];
            if(i != vet1.length-1)
                string += ", ";
        }
        string += "}";
        return string;
    }
    public static String produto(int vet1[], int vet2[]){
        String string = "{";
        for(int i = 0; i < vet1.length; i++){
            string += vet1[i] * vet2[i];
            if(i != vet1.length-1)
                string += ", ";
        }
        string += "}";
        return string;
    }
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int v1[] = new int[n];
        int v2[] = new int[n];

        for(int i = 0; i < n; i++)
            v1[i] = s.nextInt();
        for(int i =0; i < n; i++)
            v2[i] = s.nextInt();

        //System.out.println("Vetor 01: "+imprimirVetor(v1));
        //System.out.println("Vetor 02: "+imprimirVetor(v2));
        System.out.println("Soma : "+soma(v1,v2));
        System.out.println("Produto : "+produto(v1, v2));
    }
}
