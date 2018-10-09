package com.mustafaergan.ornek1;

import java.util.Iterator;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 12:32
 */
public class Islem {

    public static void main(String args[]) {
        for(Iterator iter = new PersonelIterator(); iter.hasNext();){
            Personel personel = (Personel) iter.next();
            System.out.println("Personel İsmi : " + personel.getIsim());
        }
    }
}
