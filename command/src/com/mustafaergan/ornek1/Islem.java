package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 10:30
 */
public class Islem {

    public static void main(String args[]) {
        Kullanici kullanici = new Kullanici();
        kullanici.hesapla('+', 100);
        kullanici.hesapla('-', 50);
        kullanici.hesapla('*', 10);
        kullanici.hesapla('/', 2);
        kullanici.geriAl(4);
        kullanici.ileriAl(4);
    }


}
