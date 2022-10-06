package ders10_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        String str = "Java heryerde guzel";

        System.out.println(str.endsWith("guzel")); // true

        System.out.println(str.endsWith(""));// true

        System.out.println(str.endsWith("Java heryerde guzel")); // true

        System.out.println(str.endsWith("Java")); // false

    }
}
