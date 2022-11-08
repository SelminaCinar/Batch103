package day08stringmanipulation;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Example 1 : Bir Stringdeki space hariç kaç tane karakter kullanildigini gösteren kodu yaziniz.
        // Ali okula gitti. ==>14

        String str = "Ali okula gitti.";
        //replace() methodu bir Stringdeki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.
        int num = str.replace(" ", "").length();
        System.out.println("num = " + num);


        //Example 2 : Bir Stringdeki tum 'a' harflerini 'A'ya ceviriniz.
        String s = "Ankara'nin tasina gozlerimin yasina bak";

        String yeniS = s.replace("a", "A");

        System.out.println(yeniS);

        //Example 3 : Bir Stringdeki tum "kara" kelimesinin yerine "*" koyunuz.

        String t = "Kara kara dusunme Ankara";

        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);// Kara * dusunme An*

        //Example 4 : Bir Stringdeki tum sayilari "*" ceviriniz.

        String stdId = "AC202117004";

        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);

        /*
        Bir grup datayi ifade eden kodlara "Regex" denir.
        "Regex" Regular Expressions in kisaltilmis halidir.

        1)Tum rakamlar ==> [0-9]
        2)Tum kucuk harfler ==> [a-z]
        3)Tum buyuk harfler ==>[A-Z]
        4)Tum harfler ==> [a-zA-Z]
        5)Sesli harfler ==>[aeiouAEIOU]
        6)Space ==> [ ]
        7)Tum rakamlar ve tum harfler ==> [0-9a-zA-z]
        8)Tum noktalama isaretleri ==> \\p{Punct}


        1)Rakamlar haric tum karakterler ==>[^0-9]
        2)Kucuk harfler haric tum karakterler ==>[^a-z]
        3)Buyuk harfler haric tum karakterler==>[^A-Z]
        4)Tum harfler haric tum karakterler==>[^a-zA-Z]
        5)Space haric ==> [^ ]

        */

        //Example 5 : Verilen bir String de kullanilan noktalama isareti ve rakamlar ve
        // space karakteri haric tum karakterlerin sayisini bulan kodu yaziniz.

        String u = "Ali 13 yasinda, dersem inanma!...";

        int sonuc = u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();
        System.out.println(sonuc);


        //Example 6 : Bir passwordun gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz.
        //            i)Space haric en az 8 karakter olmali
        //              ii)En az 1 sembol icermeli
        //            iii)En az 1 rakam icermeli
        //            iv)En az 1 buyuk harf icermeli
        //            v)Wn az bir kucuk harf icermeli"

        String pwd = "B78c? K!m";
        //            i)Space haric en az 8 karakter olmali
        boolean first = pwd.replace(" ", "").length() > 7;
        //              ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length() > 0;
        //            iii)En az 1 rakam icermeli
       boolean third = pwd.replaceAll("[^0-9]","").length()>0;
        //            iv)En az 1 buyuk harf icermeli
        boolean fourt = pwd.replaceAll("[^A-Z]","").length()>0;
        //            v)Wn az bir kucuk harf icermeli
       boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;
       boolean gecerli = first && second && third && fourt && fifth;

       if(gecerli){
           System.out.println("Passwordunuz gecerli...");
       }else{
           System.out.println("Passwordunuz gecerli degil...");
       }

       //Example 7 : Bir Stringteki noktalama isaretlerinin sayisini gosteren kodu yazin.

       String cumle = "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";

      int number= cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);

        //Example 8 : Verilen birString "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin.
        // Aksi halde "Normal" yazdirin.

        String v = "Alex";

        boolean baslangic = v.startsWith("Al");

        boolean bitis = v.endsWith("x");

        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);


    }
}
