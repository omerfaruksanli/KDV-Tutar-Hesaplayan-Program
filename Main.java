import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvTutari, kdvOrani, kdv1=0.18 , kdv2=0.08;
        Scanner inp = new Scanner(System.in);

        System.out.println("Tutar Giriniz: ");
        tutar = inp.nextDouble();

        kdvTutar = tutar < 1000 ? kdv1*tutar : kdv2*tutar;
        kdvOrani = tutar < 1000 ? kdv1 : kdv2;

        kdvTutari = kdvTutar + tutar;
        System.out.println("KDV'siz tutarımız: " + tutar);
        System.out.println("KDV ORANI : " + kdvOrani);
        System.out.println("KDV TUTARI = " + kdvTutar);
        System.out.println("TOPLAM TUTAR : " + kdvTutari);

        






    }
}