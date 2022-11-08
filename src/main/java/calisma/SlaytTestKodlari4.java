package calisma;

import java.util.Scanner;

public class SlaytTestKodlari4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Example 9 :Kullanicidan adini ve soyadini girmesini istediginiz bir program yazin.

        System.out.println("Kullanici adinizi giriniz");
        String ad = input.nextLine();

        System.out.println("Soyadinizi giriniz");
        String soyad = input.nextLine();

        System.out.println("Ad ve Soyad " + ad+soyad);


    }
}
