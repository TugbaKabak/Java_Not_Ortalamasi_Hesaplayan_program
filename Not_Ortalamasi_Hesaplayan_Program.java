import java.util.Scanner;

public class Not_Ortalamasi_Hesaplayan_Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat, fizik, turkce, kimya, tarih, muzik ;

        System.out.println("Matematik sınav notunuzu giriniz: ");
        mat=input.nextInt();

        System.out.println("Fizik sınav notunuzu giriniz: ");
        fizik=input.nextInt();

        System.out.println("Türkçe sınav notunuzu giriniz: ");
        turkce=input.nextInt();

        System.out.println("Kimya sınav notunuzu giriniz: ");
        kimya=input.nextInt();

        System.out.println("Tarih sınav notunuzu giriniz: ");
        tarih=input.nextInt();

        System.out.println("Müzik sınav notunuzu giriniz: ");
        muzik=input.nextInt();

        int toplam= (mat+fizik+turkce+kimya+tarih+muzik);
        double ortalama= toplam/6.0;

        System.out.println("Ortalamanız: " + ortalama);

        String str = (ortalama >= 60.0) ? "Geçti" : "Kaldı";
        System.out.println(str);
    }
}
