package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 12.10.2018 11:16
 */
public interface BilgisayarParcalariVisitor {
    public void visit(Bilgisayar bilgisayar);
    public void visit(Fare fare);
    public void visit(Klavye klavye);
    public void visit(Monitor monitor);
}
