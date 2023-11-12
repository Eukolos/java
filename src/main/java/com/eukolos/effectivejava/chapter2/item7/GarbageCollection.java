package com.eukolos.effectivejava.chapter2.item7;

public class GarbageCollection {
    @Override
    protected void finalize()
    {
        System.out.println("cleaned up");
    }


    public static void main(String[] args) {

        GarbageCollection joshua = new GarbageCollection();
        GarbageCollection eukolos = new GarbageCollection();
        GarbageCollection muko = new GarbageCollection();

        joshua = null;

        eukolos = muko;

        System.gc();

    }

}
