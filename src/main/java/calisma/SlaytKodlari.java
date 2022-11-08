package calisma;


import java.util.Scanner;

public class SlaytKodlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Puaninizi giriniz...");

        byte puan = input.nextByte();

        if (puan < 50) {
            System.out.println("D");
        } else if (puan == 60) {
            System.out.println("C");
        } else if (puan == 70) {
            System.out.println("B");
        } else if (puan == 80) {
            System.out.println("A");
        } else {
            System.out.println("Gecerli bir puan giriniz...");
        }
    }
}
