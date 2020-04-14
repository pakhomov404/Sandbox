package ru.stqa.sandbox;

import org.junit.Test;

public class SquareTests {

    @Test
    public void testAreas() {
        Square s = new Square(5);
        assert s.area() == 24;



    }
}
