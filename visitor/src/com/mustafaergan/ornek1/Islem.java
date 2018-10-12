package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 12.10.2018 11:17
 */
public class Islem {

    public static void main(String[] args) {
        BilgisayarParcalari bilgisayar = new Bilgisayar();
        bilgisayar.ekle(new BilgisayarParcalariArayuzVisitor());
    }

}
