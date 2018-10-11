package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 10:11
 */
class Kapali implements Durum {
    private static Kapali durum = new Kapali();

    public static Durum durum() {
        return durum;
    }

    public void bas(Buton b) {
        b.setDurum(Acik.durum());
        System.out.println("-----Açılıyor-----");
    }
}