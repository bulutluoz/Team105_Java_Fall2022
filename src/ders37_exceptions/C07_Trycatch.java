package ders37_exceptions;

public class C07_Trycatch {

    public static void main(String[] args) {
        try {
            çalış();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void çalış() {
        çalış();
        throw new RuntimeException ("Çoook çalış");
    }


}
