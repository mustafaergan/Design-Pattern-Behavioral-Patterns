package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 15:25
 */
public class LogDosya implements Log  {
    @Override
    public void logYaz(String log) {
        System.out.println("Dosya Log Verisi:"+log);
    }
}
