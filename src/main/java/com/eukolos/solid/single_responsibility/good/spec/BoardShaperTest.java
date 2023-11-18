package com.eukolos.solid.single_responsibility.good.spec;

import com.eukolos.solid.single_responsibility.good.src.BoardShaper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardShaperTest {
    @Test
    public void testItReturnsRowIndexes() {
        BoardShaper shaper = new BoardShaper(2);
        ArrayList<ArrayList<Integer>> rowIndexes = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> rowOne = new ArrayList<Integer>();
        ArrayList<Integer> rowTwo = new ArrayList<Integer>();
        rowOne.add(0);
        rowOne.add(1);
        rowTwo.add(2);
        rowTwo.add(3);
        rowIndexes.add(rowOne);
        rowIndexes.add(rowTwo);

        assertEquals(rowIndexes, shaper.rowIndexes());
    }
}
