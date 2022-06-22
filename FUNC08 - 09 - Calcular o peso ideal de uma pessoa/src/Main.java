import java.util.Scanner;

public class Main {
    public static double pesoIdeal(double altura, char sexo){
        double peso = 0;
        if(sexo == 'm' || sexo == 'M')
            peso = (72.7 * altura)-58;
        else
            peso = (62.1 * altura)-44.7;

        return peso;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double altura = s.nextDouble();
        char sexo = s.next().charAt(0);

        System.out.printf("%.2f",pesoIdeal(altura,sexo));
    }
}