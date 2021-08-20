package DesafioClasses;

public class DataTeste {
    public static void main(String[] args) {

        Data d1= new Data();
        Data d2 = new Data();


        d1.ano = 2021;
        d1.dia = 18;
        d1.mes = 8;

        System.out.println("Hoje é " + d1.dia + "/" + d1.mes + "/" + d1.ano);


    }
}
