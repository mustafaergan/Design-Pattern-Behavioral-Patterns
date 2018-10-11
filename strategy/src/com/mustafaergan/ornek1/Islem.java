package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 15:32
 */
public class Islem {

    public static void main(String args[]) {
        LogYazici logYazici = new LogYazici(new LogDosya());
        logYazici.logEkle("test 1");
        logYazici = new LogYazici(new LogDB());
        logYazici.logEkle("test 2");
    }

}
