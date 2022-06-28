import java.util.Scanner;

public class Main {
    public static double volumeEsfera(double raio){
        return (4 * 3.1416 * (raio * raio * raio)) / 3;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double raio = s.nextDouble();
        System.out.printf("Volume : %.2f\n",volumeEsfera(raio));
    }
}