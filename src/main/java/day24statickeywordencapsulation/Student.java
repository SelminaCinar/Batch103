package day24statickeywordencapsulation;

/*

           EnCapsulation "Data Hiding(Gizlemek)" demektir.
1)Datayi nicin gizlersiniz ?==>Datayi dis etkenlerden korumak icin.
2)Datayi nasil gizlersin?==>Access Modifieri "private" yaparak gizlersin.
3)Datayi gizledikten sonra baska classlardan okumak istersen ne yaparsın?
  "get" methodlar(getter) olusturarak gizledigimiz datalari okunur hale getirebiliriz.
4)Datayi gizledikten sonra baska Classlardan degistirmek istersen ne yaparsın?
  "set" methodlar(setter) olusturarak gizledigimiz dataları degistirebiliriz
5)Variable'in data type i ile get methodun return typei ayni olmalidir.
6)getter'lari isimlendirirken "get + <variable name> ancak variable'in data type'i boolean ise
  "boolean" "is+<variable ismi>
 */


public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;


    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
