package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 16:39
 */
public class KisiMemento extends Kisi {

    public KisiMemento(String ad) {
        super(ad);
    }

    @Override
    public String toString() {
        return "Adı:"+ad;
    }
}
