package DesafioWhile;

import java.util.Scanner;

public class WhileDesafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

      int qtdNota = 0;
      double nota = 0;
      double totalNota = 0;


      while (nota != -1){ //o valor -1 encerra a repetição

          System.out.println("Digite uma nota válida: ");
          nota = entrada.nextDouble();

          if (nota <= 10 && nota >= 0){ // só notas de 0 a 10
              totalNota += nota;
              qtdNota++;
          };
      };
        System.out.println("A média das notas é " + totalNota / qtdNota); //calcula de forma direta a média das notas











        entrada.close();

    }
}
