package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 16:39
 */
public class Kisi {
    public String ad;

    public Kisi(String ad) {
        this.ad = ad;
    }

    public KisiMemento kayit() {
        return new KisiMemento(ad);
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    @Override
    public String toString() {
        return "Adı:"+ad;
    }
}
