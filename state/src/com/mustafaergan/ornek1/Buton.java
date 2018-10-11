package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 10:10
 */
public class Buton {
    private Durum durum;

    public Buton() {
        durum = Kapali.durum();
    }

    public void setDurum(Durum s) {
        durum = s;
    }

    public void bas() {
        durum.bas(this);
    }
}
