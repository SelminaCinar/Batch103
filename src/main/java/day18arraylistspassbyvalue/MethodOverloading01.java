package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {
        /*
        Method Overloading nasil yapilir ?
        1)Method isimleri ayni olmalidir.
        2)Method parametreleri farkli olmalidir.
          i)Parametre sayilari degistirilebilir.
          ii)Parametrelerin data typelarini degistirebilirsiniz.
          iii)Parametrelerin yerlerini degistirebilirsiniz ancak data tipleri farkli ise yapabilirsiniz.
        3)Method Ismi+Parametreler = Method Signature(İmzası)
         Method Signature disinda ne degistirirseniz degistirin Java o methodlari farkli kabul etmez.

         */

        add(3, 5);
        add(3, 5.0);


    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }
}
