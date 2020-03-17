package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class SquareTests {

@Test

public void testArea() {
        Square s = new Square (8);
        assert s.area() == 64;
    }
}
