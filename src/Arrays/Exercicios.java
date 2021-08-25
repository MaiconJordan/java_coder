package Arrays;

import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        double[] notasDoAlunoA = new double[3];

        notasDoAlunoA[0] = 7;
        notasDoAlunoA[1] = 8;
        notasDoAlunoA[2] = 9;


        System.out.println(Arrays.toString(notasDoAlunoA));
        System.out.println(notasDoAlunoA[0]);

        double[] notasDoAlunoB = {1.0, 3.0, 4.0, 5.0};

        System.out.println(notasDoAlunoB[0]);
        System.out.println(notasDoAlunoB.length);

    }
}
