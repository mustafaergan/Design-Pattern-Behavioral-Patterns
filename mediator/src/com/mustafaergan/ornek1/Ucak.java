package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 15:25
 */
public abstract class Ucak {

    private Kule kule;
    private String ucusNo;
    private boolean inisIzni;

    public Ucak(String ucusNo) {
        this.ucusNo = ucusNo;
    }

    public void inisIzniIste() {
        kule.inisIzni(ucusNo);
    }

    public void izinler(boolean izin) {
        this.inisIzni = izin;
        if (inisIzni)
            System.out.println("İniş izni verildi.");
        else
            System.out.println("İniş izni red edildi.");
    }

    public void setKule(Kule kule) {
        this.kule = kule;
    }

    public void setUcusNo(String ucusNo) {
        this.ucusNo = ucusNo;
    }

    public Kule getKule() {
        return kule;
    }

    public String getUcusNo() {
        return ucusNo;
    }

    public boolean isInisIzni() {
        return inisIzni;
    }

    public void setInisIzni(boolean inisIzni) {
        this.inisIzni = inisIzni;
    }
}
