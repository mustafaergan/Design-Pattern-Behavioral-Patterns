package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 10:13
 */
public class HesapMakinesiKomut extends Komut {
    private char islemTuru;
    private int gonderilen;
    private HesapMakinesi hesapMakinesi;

    public HesapMakinesiKomut(HesapMakinesi hesapMakinesi, char islemTuru, int gonderilen) {
        this.hesapMakinesi = hesapMakinesi;
        this.islemTuru = islemTuru;
        this.gonderilen = gonderilen;
    }

    @Override
    public void ileri() {
        hesapMakinesi.islem(islemTuru, gonderilen);
    }

    @Override
    public void geri() {
        hesapMakinesi.islem(geriAl(islemTuru), gonderilen);
    }

    private char geriAl(char islemTuru) {
        switch (islemTuru) {
            case '+':
                return '-';
            case '-':
                return '+';
            case '*':
                return '/';
            case '/':
                return '*';
            default:
                throw new IllegalArgumentException();
        }
    }
}
