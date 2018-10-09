package com.mustafaergan.ornek1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 15:24
 */
public class AtaturkKule implements Kule {

    private List<Ucak> ucaklar = new ArrayList<>();


    @Override
    public void inisIzni(String ucusNo) {
        boolean izin = true;

        if(ucaklar.stream().filter(p -> p.isInisIzni() == true).count() > 0)
            izin = false;

        //uçağın cevap alması için barındırdığı metoda cevap verilir.
        ucaklar.stream().filter(p -> p.getUcusNo() == ucusNo).findAny().get().izinler(izin);

    }

    @Override
    public void ucakKaydi(Ucak ucak) {
        ucaklar.add(ucak);
        ucak.setKule(this);
    }
}
