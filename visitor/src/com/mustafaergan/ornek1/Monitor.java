package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 12.10.2018 11:15
 */
public class Monitor implements BilgisayarParcalari {

    @Override
    public void ekle(BilgisayarParcalariVisitor bilgisayarParcalariVisitor) {
        bilgisayarParcalariVisitor.visit(this);
    }
}
