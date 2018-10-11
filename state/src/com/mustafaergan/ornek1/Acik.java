package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 10:11
 */
class Acik implements Durum {
    private static Acik durum = new Acik();

    public static Durum durum() {
        return durum;
    }

    @Override
    public void bas(Buton b) {
        b.setDurum(Kapali.durum());
        System.out.println("-----Kapatılıyor-----");
    }
}