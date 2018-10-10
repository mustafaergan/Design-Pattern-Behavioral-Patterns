package com.mustafaergan.ornek1;

import java.text.MessageFormat;

/**
 * @author : MustafaERGAN
 * Date: 10.10.2018 13:53
 */
public class StandartUye implements Uye {

    private String ePosta;

    public StandartUye(String ePosta) {
        this.ePosta = ePosta;
    }

    @Override
    public void fiyatBildirimi(Ev ev) {
        System.out.println(MessageFormat.format("{0} ın fiyatı {1} oldu {2} e-posta adresine gönderildi.", ev.getAdres(), ev.getFiyat(), ePosta));
    }
}
