/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg10119075.pbo2;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan barbershop 
 */

 
import java.util.Scanner;
public class QUIZ10119075PBO2 {


public static void main(String[] args)
    {
//        inisialisasi java library scanner
        Scanner scan = new Scanner(System.in);
//        menampilkan menu makanan
        System.out.println(" ____________________________________");
        System.out.println("|         PAKET SERVICE LIST         |");
        System.out.println("|____________________________________|");
        System.out.println("|o Nama            |  Harga          |");
        System.out.println("|1. HAIR CUT       |   Rp 45000,00   |");
        System.out.println("|2. Hairwash       |   Rp 55000,00   |");
        System.out.println("|3. Hairwash only  |   Rp 15000,00   |");
        System.out.println("|__________________|_________________|");
        System.out.println("");

//        inisialisasi pembayaran awal
        int harga = 0;
//        inisialisasi harga ketiga menu
        int h1 = 45000, h2 = 55000, h3 = 15000,          menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("_____________________________________");
//        pengguna memasukkan nomor pesanan
        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor = scan.nextInt();
        System.out.print("Masukkan Banyak Pesanan : ");
        int jumlah = scan.nextInt();
        System.out.println("_____________________________________");

            switch (inNomor) {
                case 1:
                    //
                    menu = "  HAIR CUT    ";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h1 * jumlah;
                    break;
                case 2:
                    //
                    menu = " Hairwash  ";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h2 * jumlah;
                    break;
                case 3:
                    //
                    menu = " Hairwash only";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h3 * jumlah;
                    break;
                {
//            
//            jika selain nomor satu sampai tiga, maka akan ditampilkan "Nomor yang dipilih tidak ada di menu."
{
                    System.out.println("Nomor yang dipilih tidak ada di menu.");
                }

//            User diperintahkan untuk memasukkan data apakah dia akan melanjutkan atau tidak
System.out.println("Apakah anda mau melanjutkan? Y/T");
i = scan.next();

                }           System.out.println("___________________________________________________________________");
                System.out.println("Total pembayaran sebesar " +harga+".");
                System.out.println("Terimakasih atas kunjungannya.");
                    break;
                default:
                    break;
            }
}