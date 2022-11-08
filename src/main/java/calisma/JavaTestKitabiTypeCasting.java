package calisma;

public class JavaTestKitabiTypeCasting {
    public static void main(String[] args) {
        //Soru1)
        short yas = 28 ;
        int newYas = yas;
        //Soru2)
        long yas1 = 28;
        int newYas1 = (int)yas1;
        //Soru3)
        double price = 14.99;
        float newPrice = (float)price;
        //Soru4)
        double price1 = 4.3;
        short newPrice1 = (short)price1;

        System.out.println(newPrice1);

        //Soru5)
        byte height = 48;
        double newHeight = height;

        System.out.println(newHeight);
    }
}
