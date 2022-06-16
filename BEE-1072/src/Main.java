import java.util.Scanner;

public class Main {
    public static void Main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int vet[] = new int[n];
        int in = 0;
        int out = 0;
        for(int i = 0; i < n; i ++)
            vet[i] = s.nextInt();
        
        for(int i = 0; i < n; i ++){
            if (vet[i] >= 10 && vet[i] <= 20){
                in += 1;
            }else{
                out += 1;
            }
        }

        System.out.printf("%d in\n",in);
        System.out.printf("%d out\n",out);

    }
}
