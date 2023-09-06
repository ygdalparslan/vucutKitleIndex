import java.util.Scanner;

public class VucutKitleIndexHesaplama {

    /*
    kullanıcıdan boy ve kilo değerlerini alarak aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
    Formül : Kilo (kg) / Boy(m) * Boy(m)
    Eğer Vücut Kitle İndeksi .

        18.5'ten küçükse ekrana "Zayıf"
        18.5 ile 24.9 arasında ise ekrana "İdeal"
        25 ile 29.9 arasında ise ekrana "Şişman"
        30 ile 34.9 arasında ise ekrana "Obez"
        35'ten büyükse ise ekrana "Aşırı Obez" yazsın.
     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Kg olarak giriniz");
        double kilo = scan.nextDouble();
        System.out.println("Lütfen Boyunuzu m olarak giriniz");
        double boy = scan.nextDouble();
        double vki = kilo / Math.pow(boy, 2);


        if (vki < 18.5) {
            System.out.println("Zayıf");
        } else if (vki >= 18.5 && vki < 25) {
            System.out.println("İdeal");
        } else if (vki >= 25 && vki < 30) {
            System.out.println("Şişman");
        } else if (vki >= 30 && vki < 34.9) {
            System.out.println("Obez");
        }else if (vki>=35) {
            System.out.println("Aşırı Obez");
        }


    }
}
