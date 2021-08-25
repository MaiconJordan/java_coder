package Arrays;

public class Foreach {

    public static void main(String[] args) {
        double[] notas = {2.3,3.4,5.4,6.4};

        // laço de repetiçao antigo, para percorrer array
        for (int i = 0 ; i < notas.length ; i++ ){
            System.out.println(notas[i] + " ");
        }
        System.out.println(" ");
        //laço otimizado (foreach)
        for (double nota: notas){
            System.out.println(nota + " ");
        }
    }


}
