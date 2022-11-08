package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        /*
        Kullanicidan ilk orta ve soy ismini aliniz ve asagidaki formatta yazdiriniz.
        Ali Mert Can
        123456789

         */
        Scanner input = new Scanner(System.in);
         //1.yol:
        System.out.println("Ilk isminizi giriniz..." );
        String ilkIsim = input.next();//next() methodu kullanicidan String datasi almak icin kullanilir.

        System.out.println("Orta isminizi giriniz...");
        String ortaIsim = input.next();

        System.out.println("Soy isminizi giriniz..." );
        String soyIsim = input.next();

        System.out.println("Kimlik numaranizi giriniz...");
        String kimlikNo = input.next();

        System.out.println(ilkIsim + " " + ortaIsim +" " + soyIsim );
        System.out.println(kimlikNo);

        //2.Yol:

        System.out.println("Ilk, orta, soy isminizi ve kimlik numaranizi giriniz...");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();
        /*
        next() ile nextLine() in farki nedir?
        next() methodu kullanicidan gelen Stringin sadece ilk kelimesini alir.
        nextLine() methodu kullanicidan gelen stringin tamamini alir.
         */

        //3.Yol:
        System.out.println("Ilk , orta ve soy isminizi giriniz...");
        String tamIsim = input.nextLine();

        System.out.println(tamIsim);

        System.out.println("Kimlik numaranizi giriniz...");
        String kimlikNumarasi = input.next();

        System.out.println(kimlikNumarasi);



    }
}
