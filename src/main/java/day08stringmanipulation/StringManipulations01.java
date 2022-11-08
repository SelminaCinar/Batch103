package day08stringmanipulation;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1 : Kullanicidan aldiginiz isimin ilk ve son harfini ekrana yazdiriniz.
        //            Ramazan ==> Rn

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = input.next();

        //1.Yol:
        char ilkHarf = isim.charAt(0);

        char sonHarf = isim.charAt(isim.length() - 1);//Yazdiginiz kod sadece bazi durumlar icin calisirsa o koda "Hard Codding"denir.
//        //Yazdiginiz kod her durum icin calisirsa "Dynamic Coding" denir.
//        System.out.println("" + ilkHarf + sonHarf);
//
//        //2.Yol:
        String ilk = isim.substring(0, 1);
        String son = isim.substring(isim.length() - 1);

        System.out.println(ilk + son);


        //Example 2 : Verilen Stringteki sadece hayvan isimlerini ekrana yazdiriniz.
        // Ben kedi esim tavuk oglum inek sever.

        String str = "Ben kedi, esim tavuk, oglum sever inek ";
        //substring()in iki kullanimi vardir.
        //1) substring (baslangic indeksi,bitis indeksi ) Stringin ortasından bir parça almaya yarar.
        //2) substring(baslangic indeksi) Stringin verilen indeksten sonuna kadar almaya yarar.

        String kedi = str.substring(4, 8);
        String tavuk = str.substring(15, 20);
        String inek = str.substring(34);

        System.out.println(kedi + tavuk + inek);

        //Example 3 : İlk isim ve soy isimi iceren isimlerden ilk ve soy isimlerin basharflerini ekrana yazdiriniz.

        System.out.println("İlk ve soy isminizi giriniz");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0, 1);
        String b = tamIsim.split(" ")[1].substring(0, 1);
        System.out.println(a+b);


    }
}
