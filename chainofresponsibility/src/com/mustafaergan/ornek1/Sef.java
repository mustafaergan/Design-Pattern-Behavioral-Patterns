package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 8.10.2018 16:24
 */
public class Sef extends Personel {

    public Sef(Personel personel) {
        this.amir = personel;
    }

    @Override
    public void isTalebi(Istek istek) {
        if(istek.getIstekTipi() == IstekTipi.SIKAYET){
            System.out.println("Şikayetiniz işleme alınmıştır. İstem:"+istek.getIstek());
        }else{
            System.out.println("Üst Birime İletildi - Müdür");
            amir.isTalebi(istek);
        }
    }
}
