package com.mustafaergan.ornek2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 15:32
 */
public class Islem {

    public static void main(String args[]) {
        LogYazici logYazici = new LogYazici(Arrays.asList(new LogDosya(),new LogDB()));
        logYazici.logEkle("test 1");
        logYazici.logEkle("test 2");
    }

}
