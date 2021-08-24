package DesafioClasses;

public class Data {

    int dia;
    int mes;
    int ano;

     Data(int mesS, int anoO, int diaA) {
        mes = mesS;
        ano = anoO;
        dia = diaA;

    }

    Data () {
         dia = 1;
         mes = 1;
         ano = 1970;
    }



    String dataFormatada(){
        return (String)( dia + "/" + mes + "/" + ano);
    }


}
