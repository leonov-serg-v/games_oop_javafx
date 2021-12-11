package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.assertEquals;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Figure figure = new BishopBlack(Cell.C8);
        Cell resultCell = figure.position();
        Cell expectedCell = Cell.C8;
        assertEquals(expectedCell, resultCell);
    }

    @Test
    public void testCopy() {
        Figure figure = new BishopBlack(Cell.C8).copy(Cell.D7);
        Cell resultCell = figure.position();
        Cell expectedCell = Cell.D7;
        assertEquals(expectedCell, resultCell);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testWayErr() {
        Figure figure = new BishopBlack(Cell.C1);
        figure.way(Cell.H8);
    }

    @Test
    public void testWayOk() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell[] steps = figure.way(Cell.G5);
        Cell[] expextedSteps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(expextedSteps, steps);
    }

    @Test
    public void testWayXPlusYMinus() {
        Figure figure = new BishopBlack(Cell.E5);
        Cell[] steps = figure.way(Cell.H8);
        Cell[] expextedSteps = {Cell.F6, Cell.G7, Cell.H8};
        Assert.assertArrayEquals(expextedSteps, steps);
    }

    @Test
    public void testWayXPlusYPlus() {
        Figure figure = new BishopBlack(Cell.E5);
        Cell[] steps = figure.way(Cell.H2);
        Cell[] expextedSteps = {Cell.F4, Cell.G3, Cell.H2};
        Assert.assertArrayEquals(expextedSteps, steps);
    }

    @Test
    public void testWayXMinusYPlus() {
        Figure figure = new BishopBlack(Cell.E5);
        Cell[] steps = figure.way(Cell.D4);
        Cell[] expextedSteps = {Cell.D4};
        Assert.assertArrayEquals(expextedSteps, steps);
    }

    @Test
    public void testWayXMinusYMinus() {
        Figure figure = new BishopBlack(Cell.E5);
        Cell[] steps = figure.way(Cell.B8);
        Cell[] expextedSteps = {Cell.D6, Cell.C7, Cell.B8};
        Assert.assertArrayEquals(expextedSteps, steps);
    }

}