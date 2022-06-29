package br.academia.qa.com;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        String nome1;
        String nome2;
        String aux;
        Scanner ler = new Scanner(System.in);
        nome1 = " é a Capitã Marvel!!";

        System.out.print("Qual o seu nome?: ");
        nome2 = ler.next();
        aux = nome2;
        nome2 = nome1;
        nome1 = aux;
        System.out.println(nome1+nome2);
    }
}

