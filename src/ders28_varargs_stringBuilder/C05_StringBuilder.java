package ders28_varargs_stringBuilder;

public class C05_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java candir.");

        System.out.println(sb.capacity()); // 16 + 12 = 28
        System.out.println(sb.length()); // 12

        System.out.println(sb.reverse()); // .ridnac avaJ
        sb.reverse(); // Java candir.

        sb.replace(0,4,"Ahmet hoca");

        System.out.println(sb); // Ahmet hoca candir.

        sb.insert(18,"Bu bir yalandir"); // Ahmet hoca candir.Bu bir yalandir
        System.out.println(sb);

        String str= "Java cok guzel";

        sb.insert(21,str,9,14);

        System.out.println(sb); // Ahmet hoca candir.Bu guzelbir yalandir


    }
}
