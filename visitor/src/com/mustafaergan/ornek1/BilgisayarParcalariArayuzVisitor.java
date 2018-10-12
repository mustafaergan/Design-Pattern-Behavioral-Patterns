package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 12.10.2018 11:16
 */
public class BilgisayarParcalariArayuzVisitor implements BilgisayarParcalariVisitor {

    @Override
    public void visit(Bilgisayar bilgisayar) {
        System.out.println("Görüntüleniyor Bilgisayar.");
    }

    @Override
    public void visit(Fare fare) {
        System.out.println("Görüntüleniyor Fare.");
    }

    @Override
    public void visit(Klavye klavye) {
        System.out.println("Görüntüleniyor Klavye.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Görüntüleniyor Monitor.");
    }
}