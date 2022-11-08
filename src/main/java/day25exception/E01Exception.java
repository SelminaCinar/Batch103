package day25exception;

public class E01Exception {
    /*
    1)"Exception" (istisnai hata) javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
    2)Exception'lar ile calismanin iki yolu vardir.
       a)try-catch block kullanma ve exception olussa bile calismayi devam ettirme
       b)throw exception kullanarak calismayi durdurma (mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamiz
       gerekiyorsa bu dosyamiz eger silinmis ise java dosyayi bulamaz ve uygulamanın devam etmesi gerekmez)
    3) Eger exceptionı handle etmezsek (sorunu halletmezsek)java calismayi durdurur.
    4)try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz.
    5)try-catch olmaksizin yalnız kullanilmaz.
    6)Eger yazmis oldugunuz herhangi bir kod satirinda problem olabilecegini dusunuyorsaniz try-catch block icine koymalisiniz.
    7)catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir.
    8)e.getmessage(),methodunu kullanarak teknik mesajlar elde edebiliriz.
    System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir.
    e.printStackTrace() methodu Exception ile ilgili detaylı teknik mesaj verir,kod calismaya devam eder.
    System.err.println() hata mesajını renkli olarak verir bu sayede konsolda kolaylikla bulabiliriz.
    9)Eger try body icindeki kod sorunsuz calisirsa catch block calismaz.
     */

    public static void main(String[] args) {
//        divide(6,2);//3
//        divide(0,2);//0
//        divide(6,0);//Exception

        divide2(5,0);

    }

    //1.Yol Tavsiye edilmez.
    //Bir developer icin tum matematşk kurallarini ezbere bilmek mumkun degildir
//    public static void divide (int a, int b){
//        if(b==0){
//            System.out.println("bir sayi sifir ile bolunemez");
//        }else System.out.println(a/b);
//
//    }

    //2.Yol try-catch kullanarak exception'ı handle etmek tavsiye edilir.
    public static void divide2 (int a,int b){
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Bolme isleminde bir problem olustu" + e.getMessage());
            e.printStackTrace();
            System.err.println("Bolme isleminde bir problem olustu");

        }

        //Java matematik ile ilgili karsilasilmasi muhtemel tum istisnalari,hatalari Arithmetic Exception classina koymustur.
        //Matematikteki tum istisnalari detaylari bilmek zorunda degiliz.

    }






}
