package com.mustafaergan.ornek1;

import java.util.Stack;

/**
 * @author : MustafaERGAN
 * Date: 9.10.2018 16:39
 */
public class KisiMemory {

    Stack<KisiMemento> kisiMementoStack = new Stack<>();

    public void kayit(KisiMemento m) {
        kisiMementoStack.push(m);
    }

    public KisiMemento geri() {
        return kisiMementoStack.pop();
    }
}
