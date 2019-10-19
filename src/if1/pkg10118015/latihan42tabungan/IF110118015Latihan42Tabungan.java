/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan42tabungan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : program penarikan uang pada saldo tabungan
 */
public class IF110118015Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo Awal : ");
        Tabungan tbg = new Tabungan(input.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = input.nextInt();
        System.out.println("Saldo anda sekarang : "+tbg.ambilUang(jumlah));
        
    }
    
}
