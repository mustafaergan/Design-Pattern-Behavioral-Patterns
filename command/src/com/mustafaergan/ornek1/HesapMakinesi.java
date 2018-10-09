package com.mustafaergan.ornek1;

import java.text.MessageFormat;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 10:14
 */
public class HesapMakinesi {

    private int deger = 0;

    public void islem(char islemTuru, int islenen) {
        switch (islemTuru) {
            case '+':
                deger += islenen;
                break;
            case '-':
                deger -= islenen;
                break;
            case '*':
                deger *= islenen;
                break;
            case '/':
                deger /= islenen;
                break;
        }

        System.out.println(MessageFormat.format("Mevcut değer = {0} (İşlem türü: {1}, İşlenen: {2})", deger, islemTuru, islenen));
    }
}
