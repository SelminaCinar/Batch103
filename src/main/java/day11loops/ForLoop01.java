package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1 :3ten 6ya kadar tam sayilarin toplamini bulan kodu yaziniz.
        int sum = 0;

        //NOTE:System.out.println(sum) ; loopun disina yazilirsa sumın sadece son degerini ekrana yazdirir.
        //loopun icine yazilirsa her bir loop icin sumın hangi degerleri aldigini yazdirir.

        for (int i = 3; i < 7; i++) {

            sum = sum + i;
        }

        System.out.println(sum);


        //Example 2:6 dan 3e kadar tamsayilarin carpimini bulan kodu yaziniz.
        int multiply = 1;
        for (int i = 6; i > 2; i--) {
            multiply = multiply * i;
        }
        System.out.println("multiply = " + multiply);

        //Example 3 : Bir tam sayinin rakamları toplamını bulunuz.
        //bir sayının son rakamını almak için %10 işlemi yapınız.
        //Javada tam sayiyi tam sayiya bolerseniz sonuc tam sayi olur.
        //Eger sonuc virgullu sayi ise java ondalik kismi siler.

        int num = 385;
        
        num = Math.abs(num);
        int sonuc = 0;
        for (int i = num; i > 0; i = i / 10) {

            sonuc = sonuc + i % 10;

        }
        System.out.println("sonuc = " + sonuc);

        //Example 4 : Size verilen bir Stringi ters ceviren kodu yaziniz.
        String str = "Kaba";
        //Concatenation yapacaksanız "" kullanin.
        String ters = "";
        
        for (int i =str.length()-1;i>-1; i--){
            
            char c =str.charAt(i);
            ters = ters+c;
        }
        System.out.println("ters = " + ters);
} }
