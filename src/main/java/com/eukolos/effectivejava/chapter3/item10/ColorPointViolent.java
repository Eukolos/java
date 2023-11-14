package com.eukolos.effectivejava.chapter3.item10;

import java.awt.*;

public class ColorPointViolent extends Point {
    private final Color color;

    public ColorPointViolent(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Broken - violates symmetry!
//    @Override public boolean equals(Object o) {
//        if (!(o instanceof ColorPoint))
//            return false;
//        return super.equals(o) && ((ColorPoint) o).color == color;
//    }

    // Broken - violates transitivity!
    @Override public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;

        // If o is a normal Point, do a color-blind comparison
        if (!(o instanceof ColorPointViolent))
            return o.equals(this);

        // o is a ColorPoint; do a full comparison
        return super.equals(o) && ((ColorPointViolent) o).color == color;
    }

    // equivalence relations most important thing when overriding equals
    public static void main(String[] args) {

        // break symmetry
//        Point p = new Point(1, 2);
//        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
//        System.out.println(p.equals(cp)); // true
//        System.out.println(cp.equals(p)); // true

        // break transitivity

        ColorPointViolent p1 = new ColorPointViolent(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPointViolent p3 = new ColorPointViolent(1, 2, Color.BLUE);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p2.equals(p3)); // true
        System.out.println(p1.equals(p3)); // false

    }
}
