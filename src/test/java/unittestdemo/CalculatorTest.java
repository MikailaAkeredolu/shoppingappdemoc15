package unittestdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/*
asertNull, Assert NotNull
Assert True
 */

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUpBeforeEach(){
        calculator = new Calculator();
    }

    @Test
    public void addTest() {
        //Given - Arrange - Setup
        double expected = 10.0;
        //When - Act - Execute
        double actual = calculator.add(8.0, 2.0);
        //Then - Assert - Verify
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void subtractTest(){
        //given
        double expected = 5.0;
        //when
        double actual = calculator.subtract(10.0, 5.0);

        //then
        assertEquals(expected, actual);
    }


    @Test
    void calculateAreaOfCircleTest() {
        //Given - radius 20  expected - 1257. ..
        double expected = 1257.64;
        //When
        double actual = calculator.calculateAreaOfCircle(20.0);
        //Then
        assertEquals(expected, actual, .99);
    }

    @Test
    public void isGreaterTest(){
        boolean actual = calculator.isGreater(10, 5);
        assertTrue(actual, "should be greater");
    }

    @Test
    public void multiplyArrayElementsByNumberGivenTest(){
        //given
        int[] array = {10,2,3,10,1,0,2,3,16,0,2};
        int [] expected = {100, 20, 30, 100, 10, 0, 20, 30, 160, 0, 20};
        //when
        int [] actual = calculator.multiplyArrayElementsByNumberGiven(array, 10);
        //then
        assertArrayEquals(expected, actual);

    }




}