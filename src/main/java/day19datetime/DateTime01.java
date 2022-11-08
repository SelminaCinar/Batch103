package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1:"Anlık tarihi"(Current Date) ekrana yazdiran kodu yaziniz.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-10-21

        //Example 2:"Anlık zamanı"(Current Time) ekrana yazdiran kodu yaziniz.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//20:42:30.538622100

        //Example 3:"Anlık tarihi"(Current Date) ve "Anlık zamanı"(Current Time) ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:46:35.612827800

        //Example 4 : Japonya'daki "Anlık tarihi"(Current Date) ve "Anlık zamanı"(Current Time) ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:52:06.603089600

        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);//2022-10-21T20:53:55.840480400

        //Example 5 : Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);//2024-12-18

        //Example 6 : Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.
        LocalDate dobToprak = LocalDate.of(2019, 12, 19);
        LocalDate dobEmre = LocalDate.of(1989, 2, 1);

        //between kullanildiginda daha eski olan tarih once yazilmalidir.
        Long diff = ChronoUnit.DAYS.between(dobEmre, dobToprak);//11278
        System.out.println(diff);

        //Example 7:Tom Aliden 3 yıl 8 ay 13 gun sonra dogdu.Ali ise Veliden 1 yıl 15 gün
        //once dogdu.Tomun dogum tarihi 18 Kasim 2011 ise Veli ve Alinin dogum tarihini bulunuz.

        //Example 8:Istanbulun fethi ile cumhuriyetin kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz
        LocalDate istanbulunFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyet = LocalDate.of(1923, 10, 29);

        Long ay = ChronoUnit.MONTHS.between(istanbulunFethi, cumhuriyet);
        System.out.println(ay);

        //Example 9: Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz.

        LocalDate myDate = LocalDate.of(1995, 5, 15);

        int day = myDate.getDayOfMonth();
        int mount = myDate.getMonthValue();

        //1.Yol
        if (day >= 21 && mount == 3) {
            System.out.println("Koc");
        } else if (day <= 20 && mount == 4) {
            System.out.println("Koc");
        } else if (day >= 21 && mount == 4) {
            System.out.println("Boga");
        } else if (day <= 20 && mount == 5) {
            System.out.println("Boga");
        }
        //2.Yol
        if ((day >= 21 && mount == 3) || (day <= 20 && mount == 4)) {
            System.out.println("Koc");
        } else if ((day >= 21 && mount == 4) || (day <= 20 && mount == 5)) {
            System.out.println("Boga");

        }
    }
}
