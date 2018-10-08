package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 8.10.2018 16:24
 */
public class Mudur extends Personel {

    public Mudur(Personel personel) {
        this.amir = personel;
    }

    @Override
    public void isTalebi(Istek istek) {
        if(istek.getIstekTipi() == IstekTipi.ARIZA){
            System.out.println("Arızanız işleme alınmıştır. İstem:"+istek.getIstek());
        }else{
            System.out.println("Üst Birime İletildi - Sube Müdürü");
            amir.isTalebi(istek);
        }
    }
}
