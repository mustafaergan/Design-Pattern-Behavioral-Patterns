package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 16:17
 */
public abstract class Database {

    public abstract void insert();

    private void baglantiAc() {
        System.out.println("-------------Bağlantı Açıldı-------------");
    }

    private void baglantiKapat() {
        System.out.println("-------------Bağlantı Kapatıldı-------------");
    }

    public void databaseKayitEkle() {
        baglantiAc();
        insert();
        baglantiKapat();
    }
}
