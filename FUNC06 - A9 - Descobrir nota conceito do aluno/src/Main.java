import java.util.Scanner;


public class Main {
    public static String conceito(double nota, int frequencia){
        String response = "";
        if(nota >= 0 && nota <= 10 && frequencia < 70)
            response = "RI";
        else if(nota >=0  && nota  <= 5.9 && frequencia > 70)
            response = "R";
        else if(nota >=6  && nota  <= 7.9 && frequencia > 70)
            response = "C";
        else if(nota >=8  && nota  <= 8.9 && frequencia > 70)
            response = "B";
        else if(nota >=9  && nota  <= 10 && frequencia > 70)
            response = "A";

        return response;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota = s.nextDouble();
        int frequencia = s.nextInt();
        System.out.println(conceito(nota,frequencia));
    }
}