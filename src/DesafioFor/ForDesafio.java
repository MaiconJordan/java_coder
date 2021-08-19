package DesafioFor;

public class ForDesafio {
    public static void main(String[] args) {

        String valor = "#";

        for (int i = 0; i <=5; i++){
            System.out.println(valor);
            valor += "#";
        }


        // realizando a mesma ação sem valor númerico no FOR

        for(String v = "#"; !v.equals("#######"); v += "#" ){
            System.out.println(v);
        }

        }
}
