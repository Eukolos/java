package com.eukolos.effectivejava.chapter4.item24;

public class NonStaticNested {

    private String sözcük = "Sözcük";

    public class NonStaticNestedClass
    {

        public void yazBunu()
        {
            System.out.println(sözcük);
        }

    }

}