package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 15:32
 */
public class LogYazici {

    Log log;

    public LogYazici(Log log) {
        this.log = log;
    }

    public void logEkle(String log) {
        this.log.logYaz(log);
    }

}
