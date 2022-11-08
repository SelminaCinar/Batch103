package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {
        
        //Example 1 : Bir sayinin pozitif olup olmadıgını ekrana yazdiran kodu yaziniz.
        
        //1.Yol : if-else
        
        int a = 12;
        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif degil");
        }
        
        //2.Yol : Ternary
                    //Condition(şart) ? - Condition dogru ise uygulanacak kod  :   Condition yanlis ise uygulanacak kod  ;
       String sonuc =       a>0       ?              "Pozitif"                 :               "Pozitif degil"           ;
        System.out.println("sonuc = " + sonuc);



        //Example2 : Iki sayidan kucuk olani secen kodu yaziniz.

        int b = 12;
        int c = 23 ;

        int min =b<c ? b : c;
        System.out.println(min);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        //           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.
        int d = -45;

        int abs = d<0 ? -1*d : d ;
        System.out.println(abs);

        //Example 4 : Iki tane sayi ayni isaretli ise bu sayilari carpiniz,farkli isaretli ise "Islem yapamam mesaji veriniz."

        int e = 12;
        int f = 10;

        //Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini OBJECT yapiniz.
        Object islem = (e>0 && f>0)  || (e<0 && f<0) ? e*f : "Islem yapamam";

        //Note : Java'da her class'in en az bir tane "parent" class'i vardir.
        //Sadece "object" class'in "parent class'i yoktur.
        
        
        
    }
}
