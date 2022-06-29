package br.academia.qa.com;

import java.util.Scanner;

public class Exercicio01 {
    Scanner scanner;

    public Exercicio01() {
        scanner = new Scanner(System.in);
    }

    private String lerNome() {
        System.out.println("Digite o nome do aluno: ");
        return scanner.next();
    }

    private float lerNota(String n) {
        System.out.println("Digite a nota " + n);
        return scanner.nextFloat();
    }

    private float calcularMedia(float n1, float n2, float n3, float n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }

    public static void main(String[] args) {
        String nome;
        float n1, n2, n3, n4;

        Exercicio01 calculadoraMedia = new Exercicio01();

        nome = calculadoraMedia.lerNome();
        n1 = calculadoraMedia.lerNota("1");
        n2 = calculadoraMedia.lerNota("2");
        n3 = calculadoraMedia.lerNota("3");
        n4 = calculadoraMedia.lerNota("4");

        float media = calculadoraMedia.calcularMedia(n1, n2, n3, n4);
        System.out.println("A media do aluno é: " + media);
    }
}