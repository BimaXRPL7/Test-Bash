import java.util.Scanner;

public class AntarAja {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double JasaKurir =12000;
        double JasaPacking;
        double TotalBiaya;
        double Liter;

        System.out.println("Selamat datang di program Kasir Ekspedisi Barang Antar Kota");
        System.out.println("Masukan panjang box paket (cm): ");
        double panjang = input.nextDouble();
        System.out.println("Masukan lebar box paket (cm): ");
        double lebar = input.nextDouble();
        System.out.println("Masukan tinggi box paket (cm): ");
        double tinggi = input.nextDouble();

        double volume;
        volume= panjang * lebar * tinggi;
        Liter = volume / 1000;
        JasaPacking = Liter * 1000;
        TotalBiaya = JasaKurir + JasaPacking;
        System.out.println("Total biaya kirim: "+TotalBiaya);

        input.close();
    }
}