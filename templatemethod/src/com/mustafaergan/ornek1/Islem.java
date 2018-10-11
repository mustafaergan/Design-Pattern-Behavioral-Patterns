package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 16:21
 */
public class Islem {

    public static void main(String args[]) {
        MusteriDAO musteriDAO = new MusteriDAO();
        musteriDAO.databaseKayitEkle();

        UrunDAO urunDAO = new UrunDAO();
        urunDAO.databaseKayitEkle();
    }

}
