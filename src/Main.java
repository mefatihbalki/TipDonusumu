import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenlerin Kullanıcıdan alınıyor

        int a;
        System.out.println("İnteger(Tam Sayı Örn:1) Bir Değer Giriniz: ");
        a = input.nextInt();

        double b;
        System.out.println("Double(Ondalıklı Sayı Örn:1,1) Bir Değer Giriniz: ");
        b = input.nextDouble();

        //implicit Casting (Otomatik Dönüşüm)
        double doublea = a;
        System.out.println(doublea);

        //Explicit Casting (Zorla Dönüştürme)
        int intb = (int) b;
        System.out.println(intb);
    }
}