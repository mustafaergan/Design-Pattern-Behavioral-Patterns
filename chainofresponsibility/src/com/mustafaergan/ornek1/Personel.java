package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 8.10.2018 16:11
 */
public abstract class Personel {

    protected Personel amir;

    public void amireGonder(Personel personel) {
        this.amir = personel;
    }

    public abstract void isTalebi(Istek istek);

}
