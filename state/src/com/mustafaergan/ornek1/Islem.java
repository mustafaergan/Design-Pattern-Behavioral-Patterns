package com.mustafaergan.ornek1;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 10:11
 */
public class Islem {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader( System.in );
        Buton btn = new Buton();
        while (true) {
            System.out.print("Tuşa Bas");
            is.read();
            btn.bas();
        }
    }
}

