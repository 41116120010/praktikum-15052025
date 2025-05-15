/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_15082025;

import java.util.Scanner;

public class MainKendaraan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Truk");
        System.out.println("2. Taksi");
        System.out.println("3. Sepeda Listrik");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        Kendaraan kendaraan;

        switch (pilihan) {
            case 1:
                Truk truk = new Truk();
                System.out.print("Jumlah Roda: ");
                truk.setJmlRoda(input.nextInt());
                input.nextLine();
                System.out.print("Warna: ");
                truk.setWarna(input.nextLine());
                System.out.print("Bahan Bakar: ");
                truk.setBahanBakar(input.nextLine());
                System.out.print("Kapasitas Mesin (cc): ");
                truk.setKapasitasMesin(input.nextInt());
                System.out.print("Muatan Maks (kg): ");
                truk.setMuatanMaks(input.nextInt());

                kendaraan = truk;
                break;

            case 2:
                Taksi taksi = new Taksi();
                System.out.print("Jumlah Roda: ");
                taksi.setJmlRoda(input.nextInt());
                input.nextLine();
                System.out.print("Warna: ");
                taksi.setWarna(input.nextLine());
                System.out.print("Bahan Bakar: ");
                taksi.setBahanBakar(input.nextLine());
                System.out.print("Kapasitas Mesin (cc): ");
                taksi.setKapasitasMesin(input.nextInt());
                System.out.print("Tarif Awal: ");
                taksi.setTarifAwal(input.nextInt());
                System.out.print("Tarif per Km: ");
                taksi.setTarifPerKm(input.nextInt());

                kendaraan = taksi;
                break;

            case 3:
                SepedaListrik sepedalistrik = new SepedaListrik();
                System.out.print("Jumlah Roda: ");
                sepedalistrik.setJmlRoda(input.nextInt());
                input.nextLine();
                System.out.print("Warna: ");
                sepedalistrik.setWarna(input.nextLine());
                System.out.print("Jumlah Sadel: ");
                sepedalistrik.setJmlSadel(input.nextInt());
                System.out.print("Jumlah Gir: ");
                sepedalistrik.setJmlGir(input.nextInt());
                System.out.print("Kecepatan Maks (km/h): ");
                sepedalistrik.setKecepatanMaks(input.nextInt());
                System.out.print("Jarak Tempuh (km): ");
                sepedalistrik.setJarakTempuh(input.nextInt());

                kendaraan = sepedalistrik;
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                input.close();
                return;
        }

        System.out.println("\n=== Informasi Kendaraan ===");
        kendaraan.hasil();

        input.close();
    }
}
