package com.latihan;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input, panjang, lebar, sisi, alas, tinggi, jariJari;
        float pi = 3.14f;
        boolean open = true;

        // memulai program
        while (open) {
            System.out.println("-------------------------------------------");
            System.out.println("Kalkulator Penghitung Luas dan Volume");
            System.out.println("-------------------------------------------");

            System.out.println("Menu");

            System.out.println("1. Hitung Luas Bidang");
            System.out.println("2. Hitung Volume");
            System.out.println("0. Tutup Aplikasi");

            input = userInput.nextInt();

            if(input == 1) {
                System.out.println("-------------------------------------------");
                System.out.println("Pilih bidang yang akan dihitung");
                System.out.println("-------------------------------------------");

                System.out.println("1. persegi");
                System.out.println("2. lingkaran");
                System.out.println("3. segitiga");
                System.out.println("4. persegi Panjang");
                System.out.println("0. kembali ke menu sebelumnya");

                System.out.println("-------------------------------------------");

                input = userInput.nextInt();

                // persegi
                if(input == 1) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Anda memilih persegi");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukan sisi: ");
                    sisi = userInput.nextInt();
                    System.out.println("processing...");
                    System.out.println("Luas persegi adalah " + (sisi*sisi));
                    System.out.println("-------------------------------------------");
                    System.out.println("Tekan apa saja untuk kembali ke menu utama");
                    userInput.hasNext();
                    main(new String[]{});
                    open = false;

                } else if(input == 2) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Anda memilih lingkaran");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukan jari-jari: ");
                    jariJari = userInput.nextInt();
                    System.out.println("processing...");
                    System.out.println("Luas lingkaran adalah " + (pi*(jariJari*jariJari)));
                    System.out.println("-------------------------------------------");
                    System.out.println("Tekan apa saja untuk kembali ke menu utama");
                    userInput.hasNext();
                    main(new String[]{});

                    open = false;
                } else if(input == 3) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Anda memilih segitiga");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukan Alas :");
                    alas = userInput.nextInt();
                    System.out.print("Masukan Tinggi :");
                    tinggi = userInput.nextInt();
                    float setengah = 0.5f;
                    float hasil = setengah * (alas*tinggi);
                    System.out.printf("Luas segitiga = %.0f\n" + hasil);
                    System.out.println("-------------------------------------------");
                    System.out.println("Tekan apa saja untuk kembali ke menu utama");
                    userInput.hasNext();
                    main(new String[]{});

                    open = false;
                } else if (input == 4) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Anda memilih persegi panjang");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukan Panjang :");
                    panjang = userInput.nextInt();
                    System.out.print("Masukan Lebar :");
                    lebar = userInput.nextInt();
                    System.out.printf("Luas Persegi Panjang Adalah " + (panjang*lebar));
                    System.out.println("-------------------------------------------");
                    System.out.println("Tekan apa saja untuk kembali ke menu utama");
                    userInput.hasNext();
                    main(new String[]{});

                    open = false;
                } else {
                    open = false;
                }

            }else if (input == 2){
                System.out.println("-------------------------------------------");
                System.out.println("Pilih bidang yang akan dihitung");
                System.out.println("-------------------------------------------");

                System.out.println("1. kubus");
                System.out.println("2. balok");
                System.out.println("3. tabung");
                System.out.println("0. kembali ke menu sebelumnya");

                System.out.println("-------------------------------------------");

                input = userInput.nextInt();

                if (input == 1) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Anda memilih kubus");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukan Panjang :");
                    sisi = userInput.nextInt();
                    System.out.printf("Volume Kubus Adalah " + (sisi*sisi*sisi));
                    System.out.println("-------------------------------------------");
                    System.out.println("Tekan apa saja untuk kembali ke menu utama");
                    userInput.hasNext();
                    main(new String[]{});

                    open = false;
                }else if(input == 2){
                    System.out.println("-------------------------------------------");
                    System.out.println("Anda memilih Balok");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukan Panjang :");
                    panjang = userInput.nextInt();
                    System.out.print("Masukan Lebar :");
                    lebar = userInput.nextInt();
                    System.out.print("Masukan Tinggi :");
                    tinggi = userInput.nextInt();
                    System.out.printf("Volume Balok Adalah " + (panjang*lebar*tinggi));
                    System.out.println("-------------------------------------------");
                    System.out.println("Tekan apa saja untuk kembali ke menu utama");
                    userInput.hasNext();
                    main(new String[]{});

                    open = false;

                }else if(input == 3){
                    System.out.println("-------------------------------------------");
                    System.out.println("Anda memilih Tabung");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukan Jari-Jari :");
                    jariJari = userInput.nextInt();
                    System.out.print("Masukan Tinggi :");
                    tinggi = userInput.nextInt();
                    System.out.printf("Volume Tabung Adalah " + (jariJari*tinggi*pi));
                    System.out.println("-------------------------------------------");
                    System.out.println("Tekan apa saja untuk kembali ke menu utama");
                    userInput.hasNext();
                    main(new String[]{});

                    open = false;

                }else{
                    open = false;
                }
            } else if (input == 0){
                open = false;
            }

        }
    }

}
