package CalculadoraUniversal;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Conceito de aprendizagem utilizando apenas os operadores logicos e binarios

        Scanner entrada = new Scanner(System.in); // Scanner classe de captura do terminal

        // dados de entrada
        System.out.println("Informe um numero: ");
        double num1 = entrada.nextDouble();

        System.out.println("informe outro número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String op = entrada.next();

        // lógica das operacoes (sem estrutura de controle)

        double resultado = "+".equals(op) ? num1 + num1 : 0; // se nenhuma atender sempre ira retornar zero
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        //imprime o resultado
        System.out.printf("%.2f %s %.2f = %.2f",
                num1,
                op,
                num2,
                resultado);

        entrada.close();

    }
}
