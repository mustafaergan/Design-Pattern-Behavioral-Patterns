package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 16:40
 */
public class Islem {

    public static void main(String args[]) {
        KisiMemory kisiMemory = new KisiMemory();

        Kisi kisi = new Kisi("Hasan");
        kisiMemory.kayit(kisi.kayit());
        System.out.println(kisi.toString());

        kisi.setAd("Mustafa");
        kisiMemory.kayit(kisi.kayit());
        System.out.println(kisi.toString());

        kisi.setAd("Mehmet");
        kisiMemory.kayit(kisi.kayit());
        System.out.println(kisi.toString());

        kisi = kisiMemory.geri();
        System.out.println(kisi.toString());

        kisi = kisiMemory.geri();
        System.out.println(kisi.toString());
    }


}
