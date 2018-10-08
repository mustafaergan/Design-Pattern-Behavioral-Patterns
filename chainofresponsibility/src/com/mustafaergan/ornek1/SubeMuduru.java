package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 8.10.2018 16:24
 */
public class SubeMuduru extends Personel {

    @Override
    public void isTalebi(Istek istek) {
        System.out.println("Talebiniz işleme alınmıştır. İstem:"+istek.getIstek());
    }
}