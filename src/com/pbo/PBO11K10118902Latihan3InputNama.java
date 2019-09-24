package com.pbo;

import java.util.Scanner;

/**
 *
 * # Author
 * Nama : Agung Sepruloh
 * Kelas : PBO11K
 * NIM : 10118902
 * Deskripsi Program : Program ini berisi cara agar console window dapat menerima input dari user
 *
 */

    public class PBO11K10118902Latihan3InputNama {

    public static void main(String[] args) {
        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }

}