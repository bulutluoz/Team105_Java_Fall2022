package ders27_immutableClasses_DateAndTime;

public class C03_StringPool {

    public static void main(String[] args) {

        String a= "";
        a+=2;
        a+='c';
        a+=false;

        if (a=="2cfalse") System.out.println("==");

        if (a.equals("2cfalse")) System.out.println("equals");
    }
}
