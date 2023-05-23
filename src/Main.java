import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int baslangic = 10;
        double tarife = 2.2 , km, ucret, hesap;

        Scanner input = new Scanner(System.in);
        System.out.print("Taksi Kullandığınız Mesafeyi Giriniz (km) :");
        km = input.nextDouble();

        hesap = (km * tarife) + baslangic;
        ucret = (hesap <= 20) ? 20 : hesap;

        System.out.println("Kullanılan Mesafe : " + km +"km");
        System.out.println("Ödenecek Ücret :" + ucret +"TL");

    }
}