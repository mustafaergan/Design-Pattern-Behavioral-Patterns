package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 8.10.2018 16:28
 */
public class VatandasIslem {

    public static void main(String args[]) {
        Personel sef = new Sef(new Mudur(new SubeMuduru()));

        Istek istek = new Istek("11111111", IstekTipi.ISTEK, "Asfalt Tablebi");

        sef.isTalebi(istek);

        System.out.println("-------------------------");

        istek = new Istek("11111111", IstekTipi.ARIZA, "Su Arızası");

        sef.isTalebi(istek);

    }
}
