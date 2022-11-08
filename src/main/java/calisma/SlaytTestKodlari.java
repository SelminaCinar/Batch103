package calisma;

import java.util.Scanner;

public class SlaytTestKodlari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Example 1:Bir karenin alanini ve cevresini hesaplayan programi yaz.
        System.out.println("Karenin bir kenarinin uzunlugunu giriniz");
        int kenar = input.nextInt();


        System.out.println("Alan " + kenar * kenar );
        System.out.println("Cevre " + 4 * kenar);

        //Example 2:Girilen sayinin küpünü hesaplayan programi yaziniz.

        System.out.println("Bir sayi giriniz");
        byte sayi = input.nextByte();

        System.out.println("Kup"+ sayi*sayi*sayi);


        //Example 3:Bir dikdörtgenin alanini ve cevresini hesaplayan programi yaziniz.

        System.out.println("Dikdortgenin kisa kenarinin uzunlugunu giriniz");
        int en = input.nextInt();
        System.out.println("Dikdortgenin uzun kenarinin uzunlugunu giriniz");
        int boy = input.nextInt();

        System.out.println("Alan " + en*boy );
        System.out.println("Cevre " + 2*(en+boy));


        //Example 4 : Dildortgenin prizmanın hacmini hesaplayan bir program yazin.

        System.out.println("Dikdortgenin kisa kenarinin uzunlugunu giriniz");
        int kisaKenar = input.nextInt();
        System.out.println("Dikdortgenin uzun kenarinin uzunlugunu giriniz");
        int uzunKenar = input.nextInt();
        System.out.println("Dikdortgenin yuksekligini giriniz");
        int yukseklik = input.nextInt();

        System.out.println("Prizmanın Hacmi " + kisaKenar*uzunKenar*yukseklik);


        //Example 5 : Bir dairenin alanını ve cevresini hesaplayan programi yaziniz.

        System.out.println("Dairenin yaricapini giriniz.");
        float yaricap = input.nextFloat();

        System.out.println("Alan " + 3.14159 * yaricap * yaricap);
        System.out.println("Cevre " + 2 * 3.14159 * yaricap);


        //Example 6 : Bir ucgenin cevresini hesaplayan programi yaziniz.

        System.out.println("Ucgenin a kenarini giriniz");
        byte aKenari = input.nextByte();
        System.out.println("Ucgenin b kenarini giriniz ");
        byte bKenari = input.nextByte();
        System.out.println("Ucgenin c kenarini giriniz");
        byte cKenari = input.nextByte();

        System.out.println("Cevre " + aKenari+bKenari+cKenari);

    }









    }

