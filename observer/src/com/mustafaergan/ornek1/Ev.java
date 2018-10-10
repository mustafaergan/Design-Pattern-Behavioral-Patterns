package com.mustafaergan.ornek1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : MustafaERGAN
 * Date: 10.10.2018 13:48
 */
public abstract class Ev {
    private String adres;
    private double fiyat;

    private List<Uye> uyeTakip = new ArrayList<>();

    public Ev(String adres, double fiyat) {
        this.adres = adres;
        this.fiyat = fiyat;
    }

    public void setFiyat(double fiyat) {
        if(this.fiyat > fiyat){
            uyariGonder();
            this.fiyat = fiyat;
        }
    }

    private void uyariGonder() {
        for (Uye uye: uyeTakip) {
            uye.fiyatBildirimi(this);
        }
    }

    public double getFiyat() {
        return fiyat;
    }

    public String getAdres() {
        return adres;
    }

    public List<Uye> getUyeTakip() {
        return uyeTakip;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
