package Unit_Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlustwoequalfour(){
        SimpleCalculator calculator=new SimpleCalculator();
        assertEquals(7,calculator.addNumber(2,5));
    }

}