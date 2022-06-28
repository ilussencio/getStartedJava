import java.util.Scanner;

public class Main {
    public static String categoria(int idade){
        String mensagem = "";
        if(idade >= 3 && idade <= 5)
            mensagem = "Infantil A";
        else if(idade >=6 && idade <= 8)
            mensagem = "Infantil B";
        else if(idade >= 8 && idade <= 10)
            mensagem = "Infantil C";
        else if(idade >= 11 && idade <= 12)
            mensagem = "Juvenil A";
        else if(idade >= 13 && idade <= 15)
            mensagem = "Juvenil B";
        else if(idade >= 16 && idade <= 17)
            mensagem = "Juvenil C";
        else if(idade >= 18 && idade <= 59)
            mensagem = "Adulto";
        else if(idade >= 60)
            mensagem = "Idoso";
        else
            mensagem = "Idade Invalida";

        return mensagem;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int idade = s.nextInt();
        System.out.println(categoria(idade));
    }
}