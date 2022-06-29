import java.util.Scanner;

public class Main {
    public static void validaNumero(double numero){
        if(numero >= 0 && numero <= 10)
            System.out.println("Valido");
        else if(numero >= 100 && numero <= 200)
            System.out.println("Valido");
        else
            System.out.println("Invalido");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        validaNumero(n);
    }
}