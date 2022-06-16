import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        final int quant = 12;
        double matriz[][] = new double[quant][quant];
        char sm = s.next().charAt(0);
        double result = 0;

        for(int i = 0; i < quant; i++){
            for(int j = 0; j < quant; j ++){
                matriz[i][j] = s.nextDouble();
            }
        }

        for(int i = 0; i < quant/2; i++){
            for(int j = i+1; j < quant-1-i; j ++){
                result += matriz[i][j];
            }
        }
        
        
        if(sm == 's' || sm == 'S'){            
            System.out.printf("%.1f\n",result);
        }else{
            System.out.printf("%.1f\n",result/30);
        }

        s.close();
    }
}

