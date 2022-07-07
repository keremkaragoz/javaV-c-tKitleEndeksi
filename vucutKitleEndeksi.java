import java.util.Scanner;

public class vucutKitleEndeksi {
    public static void main(String[] args) {

        double m, kg, vctendeksi;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen Boyunuzu Giriniz:  " );

        System.out.println("Lutfen Kilonuzu Giriniz:  ");

        m = inp.nextDouble();
        kg = inp.nextDouble();

        vctendeksi = (m * m) / kg;
        System.out.println("Vucut Kitle Endeksiniz:  " + vctendeksi);


    }
}
