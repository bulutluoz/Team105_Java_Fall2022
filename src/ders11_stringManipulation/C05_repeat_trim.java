package ders11_stringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {

        String str= "java guzeldir\n";

        System.out.println(str.repeat(4));
        // java guzeldir java guzeldir java guzeldir java guzeldir

        str= "   Java guzeldir   ";

        System.out.println(str.length()); // 19

        str=str.trim();

        System.out.println(str); // Java guzeldir
        System.out.println(str.length()); // 13


    }
}
