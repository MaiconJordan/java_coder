package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        // Set<String> lista = new HashSet<String>();
        TreeSet<String> lista = new TreeSet<>(); // forma ordenada da lista

        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Paulo");
        lista.add("Bia");

        for(String nomes: lista){
            System.out.println(nomes);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(12);
        nums.add(45);
        nums.add(35);
        nums.add(58);

        for (int n: nums){
            System.out.println(n);
        }

    }


}
