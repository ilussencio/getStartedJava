import java.util.Scanner;

public class Main {
    public static String soma(int vet1[], int vet2[]){
        String string = "Soma: {";
        for(int i = 0; i < vet1.length; i++){
            string += vet1[i];
            if()
        }


        return string;
    }

    public static String produto(int vet1[], int vet2[]){
        String string = "Produto: {";

        return string;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int quant = s.nextInt(0);
        int vet1[] = new int[quant];
        int vet2[] = new int[quant];

        for(int i = 0; i < quant; i++){
            vet1[i] = s.nextInt();
        }
        for(int i = 0; i < quant; i++){
            vet2[i] = s.nextInt();
        }
        System.out.println(soma(vet1,vet2));
        System.out.println(produto(vet1,vet2));
    }
}