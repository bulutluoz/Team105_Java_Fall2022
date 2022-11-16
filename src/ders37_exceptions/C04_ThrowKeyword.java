package ders37_exceptions;

public class C04_ThrowKeyword {
    public static void main(String[] args) {

        String a=null;
        String b="";
        try{
            int c= a.length()+b.length();
            throw new RuntimeException();
        }catch (NullPointerException e) {
            System.out.println("null pointer'dir, uzunlugu olmaz");
        }catch (RuntimeException e) {
            System.out.println("throw keyword");
        }

    }
}

