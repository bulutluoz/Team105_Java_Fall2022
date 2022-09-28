package ders04_matematikselIslemeler_incrementDecrement;

public class C07_Pre_Post_Increment {

    public static void main(String[] args) {



        int a= 10;


        int b = a++;


        int c= ++b;


        System.out.println("a: " + a + ", b : " + b +", c : "+ c);



        a= 20;


        b= ++a;


        c= a++;


        System.out.println("a: " + a + ", b : " + b +", c : "+ c);


        a=30;

        System.out.println(a++);

        System.out.println(--a);

        System.out.println(a--);

        System.out.println(a);
    }
}
