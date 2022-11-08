package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {
        //If it rains I will cancel the picnic
        //If statement belli kodlari belli sartlara bagli olarak calistirmaya yarar.
        //& işlemi sadece"boolean" ile kullanilir.&


        //Example 1 : Sayi pozitif ise ekrana pozitif yazdirin.


        int s = 12;
        if (s > 0) {
            System.out.println("Positive");
        }

        //Example 2:Verilen karakter buyuk harf ise ekrana buyuk harf yazdirin.

        char ch = 'A';

        if (ch >= 'A' && ch < 'Z') {
            System.out.println("Buyuk Harf");
        }
        /*
         && işlemi sadece boolean ile kullanilir.
          true && true = true
          true && false = false
          false && true = false
          false && false = false
          && islemi mükemmeliyetcidir,true sonucunu alabilmek icin hersey true olmalidir.
          Bir tane false varsa sonuc false demektir.

         */
        //Example 3:Verilen bir sayi uc basamakli ise ekrana "uc basamakli yazdiriniz.

        int sayi = 144;
        sayi = Math.abs(sayi);

        if (sayi > 99 && sayi < 1000) {
            System.out.println("Uc Basamakli");
        }
        //Example 4: Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz.

        int p = 14;

        //"=" isareti atama operatörüdür,matematikteki esittir anlamina gelmez.
        //Matematikteki esitti sembolü java'da "==" seklindedir.
        //2+3==5

        if (p % 2 == 0) {
            System.out.println("Cift sayi");
        }

        //Example 5 : Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika sayi" yazdirin.
        int r = 250;

        if (r < 300 || r > 1200) {
            System.out.println("Harika sayi");

        }

        /*
        Not:|| isleminde false alabilmek icin herseyin false olmasi gerekir.
            || isleminde sadece bir tane true sonucu true yapmaya yeter.
            || islemi sadece boolean ile kullanilir.
                  true || true = true
                  true || false= true
                  false || true= true
                  false || false= false




         */
    } }