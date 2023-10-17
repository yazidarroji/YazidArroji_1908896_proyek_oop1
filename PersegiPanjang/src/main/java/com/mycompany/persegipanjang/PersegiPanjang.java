/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persegipanjang;

/**
 *
 * @author yazidarroji
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;

    // Konstruktor untuk mengisi panjang dan lebar
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas persegi panjang
    public int getLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling persegi panjang
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        // Membuat tiga objek persegi panjang
        PersegiPanjang persegi1 = new PersegiPanjang(1, 1);
        PersegiPanjang persegi2 = new PersegiPanjang(30, 40);
        PersegiPanjang persegi3 = new PersegiPanjang(25, 35);

        // Memanggil method getLuas dan getKeliling untuk setiap objek
        int luas1 = persegi1.getLuas();
        int keliling1 = persegi1.getKeliling();

        int luas2 = persegi2.getLuas();
        int keliling2 = persegi2.getKeliling();

        int luas3 = persegi3.getLuas();
        int keliling3 = persegi3.getKeliling();

        // Menampilkan hasil untuk persegi panjang 1
        System.out.println("Persegi Panjang 1");
        System.out.println("Panjang: 1");
        System.out.println("Lebar: 1");
        System.out.println("Luas: " + luas1 );
        System.out.println("Keliling: " + keliling1 );
        System.out.println();

        // Menampilkan hasil untuk persegi panjang 2
        System.out.println("Persegi Panjang 2");
        System.out.println("Panjang: 30");
        System.out.println("Lebar: 40");
        System.out.println("Luas: " + luas2 );
        System.out.println("Keliling: " + keliling2 );
        System.out.println();

        // Menampilkan hasil untuk persegi panjang 3
        System.out.println("Persegi Panjang 3");
        System.out.println("Panjang: 25");
        System.out.println("Lebar: 35");
        System.out.println("Luas: " + luas3 );
        System.out.println("Keliling: " + keliling3 );
    }
}

