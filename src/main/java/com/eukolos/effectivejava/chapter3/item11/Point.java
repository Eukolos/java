package com.eukolos.effectivejava.chapter3.item11;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;
        Point p = (Point)o;
        return p.x == x && p.y == y;
    }
    // maybe
//    @Override public int hashCode() {
//        return 31 * x + y;
//    }

    // bad performance
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }

    @Override public int hashCode() {
        int result = Integer.hashCode(x);
        result = 31 * result + Integer.hashCode(y);
        return result;
    }

    // hashCode method with lazily initialized cached hash code
//    private int hashCode; // Automatically initialized to 0
//
//    @Override public int hashCode() {
//        int result = hashCode;
//        if (result == 0) {
//            result = Short.hashCode(areaCode);
//            result = 31 * result + Short.hashCode(prefix);
//            result = 31 * result + Short.hashCode(lineNum);
//            hashCode = result;
//        }
//        return result;
//    }


    public static void main(String[] args) {

        Point a = new Point(1, 2);
        Point b = new Point(1, 2);

        System.out.println(a.equals(b)); // true
        System.out.println(b.equals(a)); // true
        System.out.println(a.hashCode()); // 33
        System.out.println(b.hashCode()); // 33
    }

}

