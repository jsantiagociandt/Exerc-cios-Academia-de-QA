package br.academia.qa.com;

public class Exercicio04 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            int numSorteados = (int) (Math.random() * 100) + 1;
            System.out.println("Número: " + numSorteados);

        }
    }
}

