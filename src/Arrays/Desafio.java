package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas: ");
        int qtdNotas = entrada.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length ; i++){
            System.out.println("Digite a nota " + (i + 1) + ": ");
             notas[i] = entrada.nextInt();
        }

        double somaDasnotas = 0;

        for(double nota: notas){
            somaDasnotas += nota;
        }

        System.out.println("A média das notas é: " + (somaDasnotas  / notas.length));





        entrada.close();
    }
}
