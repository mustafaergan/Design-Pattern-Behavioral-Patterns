package com.mustafaergan.ornek2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : MustafaERGAN
 * Date: 11.10.2018 15:32
 */
public class LogYazici {

    List<Log> logs = new ArrayList<>();

    public LogYazici(List<Log> logs) {
        this.logs = logs;
    }

    public void logEkle(String log) {
        for (Log logTipleri : logs) {
            logTipleri.logYaz(log);
        }
    }

}
