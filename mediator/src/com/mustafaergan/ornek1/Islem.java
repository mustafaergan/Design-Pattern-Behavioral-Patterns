package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 16:16
 */
public class Islem {
    public static  void main(String args[]) {
        Kule kule = new AtaturkKule();

        Ucak TK0001 = new THYUcak("TK0001");
        Ucak TK0002 = new THYUcak("TK0002");

        kule.ucakKaydi(TK0001);
        kule.ucakKaydi(TK0002);

        TK0001.inisIzniIste();
        TK0002.inisIzniIste();

        TK0001.setInisIzni(false);

        TK0002.inisIzniIste();
    }

}
