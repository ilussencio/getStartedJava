import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double matriz[][] = new double[12][12];
        int num = s.nextInt();
        char sm = s.next().charAt(0);
        double result = 0;

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j ++){
                matriz[i][j] = s.nextDouble();
            }
        }
        
        for( int i = 0; i < 12; i++){
                result += matriz[num][i];            
        }

        if(sm == 's' || sm == 'S'){
            
            System.out.printf("%.1f\n",result);
        }else{
            System.out.printf("%.1f\n",result/12);
        }
        s.close();
    }
}
