package ru.stqa.sandbox;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(),25.0, 1.0E-01);
    }

}
