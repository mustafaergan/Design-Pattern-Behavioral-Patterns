package com.mustafaergan.ornek1;

import java.util.Iterator;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 12:22
 */
public class PersonelIterator implements Iterator {
    Personel ahmet = new Personel("Ahmet",30);
    Personel mehmet = new Personel("Mehmet",35);
    Personel hasan = new Personel("Hasan",25);
    Personel[] personeller = {ahmet,mehmet,hasan};

    int index;

    @Override
    public boolean hasNext() {
        if(index < personeller.length )
            return true;
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return personeller[index++];
        }
        return null;
    }
}
