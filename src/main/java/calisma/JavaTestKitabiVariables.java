package calisma;


public class JavaTestKitabiVariables {
    public static void main(String[] args) {
        //Soru1)
        double priceOfShirt = 28.99;
        double priceOfDress = 38.88;
        double priceOfShoes = 89.79;
        System.out.println("Toplam Fiyat : " + (priceOfShirt + priceOfDress + priceOfShoes));
        //Soru2)
        float a = 12.99F;
        long b = 18L;
        int c = 52;
        System.out.println("Degiskenlerin carpimi : " + (a * b * c));
        //Soru3)
        int anapara = 15000;
        int oran = 8;
        int yilDegeri = 5;
        System.out.println("Basit Faiz Degeri : " + (anapara * oran * yilDegeri /100));
        //Soru4)
        String x = "Sonuc";
        Long sayi1 = 148L;
        Long sayi2 = 99887755L;

        System.out.println(x + (sayi1+sayi2));
        System.out.println(x + a*b);

        //Soru5)
        boolean ogrenciMi = true;
        boolean zenginMi = false;
        System.out.println(ogrenciMi + " " + zenginMi);

        //Soru6:
        long kitap = 24L;
        long defter = 28L;
        long laptop = 2500L;
        
        double toplamFiyat = 2*kitap + 4*defter + 3*laptop;
        System.out.println("toplamFiyat = " + toplamFiyat);










    }
}
