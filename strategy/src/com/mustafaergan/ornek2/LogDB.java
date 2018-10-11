package com.mustafaergan.ornek2;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 15:25
 */
public class LogDB implements Log {
    @Override
    public void logYaz(String log) {
        System.out.println("DB Log Verisi:"+log);
    }
}
