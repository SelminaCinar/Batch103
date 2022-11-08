package calisma;

import java.util.Scanner;

public class SlaytTestKodlari3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Example 8 : Saatleri saniyeye ceviren bir program yaziniz.

        System.out.println("Saat degerini giriniz");
        long saat = input.nextLong();

        System.out.println("Saniye" + saat*60*60);
    }
}
