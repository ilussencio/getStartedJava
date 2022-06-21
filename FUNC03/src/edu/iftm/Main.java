package edu.iftm;

import java.util.Scanner;

public class Main {
    public static void imprimir(int vet[]){
        System.out.printf("{");
        for(int i = 0; i < vet.length; i++){
            System.out.printf("%d",vet[i]);
            if(i != vet.length-1)
                System.out.printf(",");
        }
        System.out.printf("}");
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int vet[] = new int[n];
        for(int i = 0; i < n; i++){
            vet[i] = s.nextInt();
        }
        imprimir(vet);

    }
}
