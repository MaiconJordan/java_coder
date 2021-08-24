package DesafioClasses;

public class DataTeste {
    public static void main(String[] args) {

        Data d1= new Data();

        Data d2= d1;

        d2.mes = 12;







        System.out.println(d1.dataFormatada());


    }
}
