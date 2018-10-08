package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 8.10.2018 16:14
 */
public class Istek {
    private String vatandasTC;
    private String istek;
    private IstekTipi istekTipi;


    public Istek(String vatandasTC, IstekTipi istektipi ,String istek) {
        this.vatandasTC = vatandasTC;
        this.istek = istek;
        this.istekTipi = istektipi;
    }

    public String getIstek() {
        return istek;
    }

    public String getVatandasTC() {
        return vatandasTC;
    }

    public IstekTipi getIstekTipi() {
        return istekTipi;
    }
}
