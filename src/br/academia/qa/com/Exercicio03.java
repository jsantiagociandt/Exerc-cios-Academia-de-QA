package br.academia.qa.com;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
//calcular media
        Scanner ler = new Scanner(System.in);
        String nome;
        java.util.Scanner nota = new Scanner(System.in);
        float n1, n2, n3, n4, mf;
        System.out.print("informe seu nome:");
        nome = ler.next();
        System.out.print("Informe a primeira nota: ");
        n1 = nota.nextFloat();
        System.out.print("Informe a segunda nota:");
        n2 = nota.nextFloat();
        System.out.print("informe a terceira nota: ");
        n3 = nota.nextFloat();
        System.out.print("Informe a quarta nota: ");
        n4 = nota.nextFloat();
        mf = (n1+n2+n3+n4)/4;
        if(mf >= 5)
        {
            System.out.print("Voce foi APROVADO "+ nome +" ");
        }
        else
        {
            System.out.print("Voce foi REPROVADO. " + nome + " ");
        }
        System.out.print("A media final em matematica eh de: " + mf + " pontos.");
    }

}

