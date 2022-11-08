package calisma;

import java.util.Scanner;

public class TestKitabı1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Bir ay ismi giriniz");
        String ayIsmi=input.nextLine();

        switch(ayIsmi){
            case "aralik":
            case "ocak":
            case"subat":
                System.out.println("Kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("İlkbahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("Sonbahar");
                break;
            default :
                System.out.println("Gecersiz ay adi");
        }
    }
}
