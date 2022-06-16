import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        

        for(int i = 1; i <= n; i++){
            int var = scan.nextInt();

            if(var == 0){
                System.out.println("NULL");
            }else{
                if(var%2 == 0 ){
                    System.out.printf("EVEN ");
                }else{
                    System.out.printf("ODD ");
                }

                if(var < 0){
                    System.out.println("NEGATIVE");
                }else{
                    System.out.println("POSITIVE");
                }
            }

        }
        scan.close();
    }
}
