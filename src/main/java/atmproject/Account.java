package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;//hesap numarasi
    private int pinNumber;//sifremiz

    private double checkingBalance;//vadesiz hesap bakiyesi
    private double savingBalance; //vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("$'###,##0.00");
    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //para cekme islemi ==>paraCekmeIslemindenSonraKalanMiktar

    private double calculateCheckingBalanceAfterWithdraw(double amount) {

        checkingBalance = checkingBalance - amount;

        return checkingBalance;
    }

    //para yatirma isleminden sonra kalan bakiyeyi hesapla

    private double calculateCheckingBalanceAfterDeposit(double amount) {

        checkingBalance = checkingBalance + amount;

        return checkingBalance;
    }

    //para cekme islemi :saving(vadeli) hesaptan para cekildikten sonra kalan bakiye

    private double calculateSavingBalanceAfterWithdraw(double amount) {

        savingBalance = savingBalance - amount;

        return savingBalance;

    }

    //para yatirma isleminden sonra kalan bakiye :saving hesap

    private double calculateSavingBalanceAfterDeposit(double amount) {

        savingBalance = savingBalance + amount;

        return savingBalance;
    }

    //musteri ile para cekmek icin ilk etkilesim

    public void getCheckingWithdraw() {
        displayCurrentAmount(checkingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz :");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Sifir veya eksi rakamlar gecersizdir");
            getCheckingWithdraw();//recursive method = methodu tekrardan cagirma
        } else if (amount <= checkingBalance) {

            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    //para yatirma (checking) : Musteri ile para yatirma icin etkilesime gecelim

    public void getCheckingDeposit() {

        displayCurrentAmount(checkingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz:");

        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Sifir veya eksi rakamlar gecersizdir");
            getCheckingDeposit();
        } else {
            System.out.println("Hesabinizda bulunan bakiye:" + calculateCheckingBalanceAfterDeposit(amount));
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }
    }

    //saving icin para cekme

    public void getSavingWithDraw() {

        displayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz :");
        double amount = input.nextDouble();

        if(amount<=0){

            System.out.println("Sifir veya eksi rakamlar gecersizdir");
            getSavingWithDraw();

        } else if (amount <= savingBalance) {
            calculateSavingBalanceAfterWithdraw(amount);
            displayCurrentAmount(savingBalance);
        }else{
            System.out.println("Yetersiz bakiye!");
        }

    }

    //para yatirma saving hesap

    public void getSavingDeposit() {

        displayCurrentAmount(savingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz:");

        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Sifir veya eksi rakamlar gecersizdir");
            getSavingDeposit();
        } else {
            System.out.println("Hesabinizda bulunan bakiye:" + calculateSavingBalanceAfterDeposit(amount));
            System.out.println();
            displayCurrentAmount(savingBalance);
        }


    }

    //son bakiyeyi goster

    public void displayCurrentAmount(double balance) {

        System.out.println("hesabinizda bulunan bakiye :" + moneyFormat.format(balance));

    }


}
