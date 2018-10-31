package com.company;

public class Main1 {
    public static void main(String[] args) {
        queue O = new queue();
        O.cetak();

        O.insert("SAYA");
        O.cetak();
        O.insert("SEMUA");
        O.cetak();
        O.insert("KAMU");
        O.cetak();

        String P = O.get();
        O.cetak();

        String P1 = O.get();
        O.cetak();

        String o3 = O.get();
        O.cetak();

    }
}
