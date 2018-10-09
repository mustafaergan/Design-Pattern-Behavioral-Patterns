package com.mustafaergan.ornek1;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 10:25
 */
public class Kullanici {
    private HesapMakinesi hesap = new HesapMakinesi();
    private List<Komut> komutlar = new ArrayList<>();
    private int sayac = 0;

    public void ileriAl(int ileriMiktar) {
        System.out.println(MessageFormat.format("İleri Al {0} sayac ", ileriMiktar));
        for (int i = 0; i < ileriMiktar; i++) {
            if (sayac < komutlar.size() ) {
                Komut komut = komutlar.get(sayac++);
                komut.ileri();
            }
        }
    }

    public void geriAl(int geriMiktar) {
        System.out.println(MessageFormat.format("Geri Al {0} sayac ", geriMiktar));
        for (int i = 0; i < geriMiktar; i++) {
            if (sayac > -1) {
                Komut komut = komutlar.get(--sayac);
                komut.geri();
            }
        }
    }

    public void hesapla(char islemTuru, int gonderilen) {
        Komut komut = new HesapMakinesiKomut(hesap, islemTuru, gonderilen);
        komut.ileri();
        komutlar.add(komut);
        sayac++;
    }
}
