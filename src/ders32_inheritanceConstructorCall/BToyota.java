package ders32_inheritanceConstructorCall;

public class BToyota extends Araba{
    BToyota(){
        System.out.println("Parametresiz Toyota Constructor");
    }

    BToyota(int pt){

        System.out.println("Parametreli Toyota Constructor");
    }

    BToyota(String pt2){
        super("Mehmet");
        System.out.println("String parametreli Toyota constructor");
    }
}
