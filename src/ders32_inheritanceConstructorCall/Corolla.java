package ders32_inheritanceConstructorCall;

public class Corolla extends BToyota {

    Corolla (int pc){
        super(5);
        System.out.println("Parametreli Corolla constructor");
    }
    Corolla(){

    }

    Corolla(String str){
        this();
        System.out.println("String parametreli Corolla cons");
    }

    public static void main(String[] args) {

        Corolla corolla3=new Corolla("Ilker");
        //Parametresiz Araba constructor
        //Parametresiz Toyota Constructor
        //String parametreli Corolla cons


        System.out.println("=======");
        Corolla corolla1= new Corolla();
        //Parametresiz Araba constructor
        //Parametresiz Toyota Constructor
        System.out.println("=======");

        Corolla corolla2=new Corolla(3);
        //Parametresiz Araba constructor
        //Parametreli Toyota Constructor
        //Parametreli Corolla constructor


    }
}
