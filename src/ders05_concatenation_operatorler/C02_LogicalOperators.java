package ders05_concatenation_operatorler;

public class C02_LogicalOperators {

    public static void main(String[] args) {


        int a= 20;
        int b= 30;

        System.out.println(a>b && b>0 && a>0); // false

        boolean sonuc= 3*a <= 2*b && a>10 && b>20;// true

        System.out.println(sonuc);
    }
}
