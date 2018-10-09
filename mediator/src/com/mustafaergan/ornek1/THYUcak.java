package com.mustafaergan.ornek1;

import java.text.MessageFormat;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 16:02
 */
public class THYUcak extends Ucak {

    public THYUcak(String ucusNo) {
        super(ucusNo);
    }

    @Override
    public void izinler(boolean izin)
    {
        System.out.println(MessageFormat.format("Thy Uçuş No:{0} iniş izni istiyor...", getUcusNo()) );
        super.izinler(izin);
    }
}
