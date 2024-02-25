import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenlerin Kullanıcıdan alınıyor

        int a;
        System.out.print("İnteger(Tam Sayı Örn:1) Bir Değer Giriniz: ");
        a = input.nextInt();

        double b;
        System.out.print("Double(Ondalıklı Sayı Örn:1,1) Bir Değer Giriniz: ");
        b = input.nextDouble();

        //implicit Casting (Otomatik Dönüşüm)
        double doublea = a;
        System.out.print("Integer Değerin Double Değere Dönüşümü: " + doublea);

        System.out.println();

        //Explicit Casting (Zorla Dönüştürme)
        int intb = (int) b;
        System.out.print("Double Değerin Integer Değere Dönüşümü: " + intb);
    }
}