package day05ifstatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Example 1:Kullanicidan alinan sayinin tek mi çift mi oldugunu ekrana yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int s = input.nextInt();
        //1.Yol:
        if (s % 2 == 0) {
            System.out.println("Cift sayi...");
        }

//"!=" demek "esit degil" demektir.

        if (s % 2 != 0) {
            System.out.println("Tek sayi...");
        }

        //2.Yol:
        if (s % 2 == 0) {
            System.out.println("Cift Sayi...");
        } else {
            System.out.println("Tek Sayi...");
        }

        //Example 2:Bir sayinin negatif , pozitif veya nötr oldugunu söyleyen kodu yaziniz.

        System.out.println("Bir sayi giriniz...");

        double d = input.nextDouble();
        if (d > 0) {
            System.out.println("Pozitif");
        } else if (d == 0) {
            System.out.println("Notr");
        } else {
            System.out.println("Negatif");
        }


    }
}


