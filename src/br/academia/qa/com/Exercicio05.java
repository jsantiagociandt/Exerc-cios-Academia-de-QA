package br.academia.qa.com;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int[] idadeHomens = new int[5];
        int[] idadeMulheres = new int[5];
        int homensMaiores = 0, mulheresMaiores = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite a idade do " + (i+1) + " homem");
            idadeHomens[i] = sc.nextInt();
            System.out.println("Digite a idade da " + (i+1) + " mulher");
            idadeMulheres[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++){
            if(idadeHomens[i] >= 18){
                homensMaiores++;
            }
            if(idadeMulheres[i] >= 18){
                mulheresMaiores++;
            }
        }

        System.out.println("Existem "+homensMaiores+" homens e "+mulheresMaiores+" mulheres maiores de idade");
    }
}

