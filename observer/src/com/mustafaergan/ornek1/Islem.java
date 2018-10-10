package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 10.10.2018 15:34
 */
public class Islem {
    public static void main(String args[]) {
        Ev kiralikEv = new KiralikEv("Ankara Huzur Mah. 4 Nolu Daire", 10.25d);

        kiralikEv.getUyeTakip().add(new StandartUye("mustafaergan1@blabal.com"));
        kiralikEv.getUyeTakip().add(new StandartUye("mustafaergan2@blabal.com"));
        kiralikEv.getUyeTakip().add(new StandartUye("mustafaergan3@blabal.com"));
        kiralikEv.getUyeTakip().add(new StandartUye("mustafaergan4@blabal.com"));

        kiralikEv.setFiyat(8.35d);
    }
}
