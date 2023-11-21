package com.eukolos.effectivejava.chapter4.item20;

public interface ŞarkıYazarı {

    public void şarkıYaz();

    default boolean şiirYazabiliyormusun()
    {

        return true;
    }

}
