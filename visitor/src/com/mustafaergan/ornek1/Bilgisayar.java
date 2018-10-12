package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 12.10.2018 11:15
 */
public class Bilgisayar implements BilgisayarParcalari {

    BilgisayarParcalari[] parts;

    public Bilgisayar(){
        parts = new BilgisayarParcalari[] {new Fare(), new Klavye(), new Monitor()};
    }


    @Override
    public void ekle(BilgisayarParcalariVisitor bilgisayarParcalariVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].ekle(bilgisayarParcalariVisitor);
        }
        bilgisayarParcalariVisitor.visit(this);
    }
}