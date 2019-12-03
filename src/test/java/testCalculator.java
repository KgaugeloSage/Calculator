import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testCalculator {

    @Test
    void  testAdd(){
        assertEquals(9,Calculator.add(3,6));
    }
    @Test
    void  testAdd2(){
        assertEquals(15,Calculator.add(1,2,3,4,5));
    }
    @Test
    void testMultiply(){
        assertEquals(15,Calculator.mutliply(3,5));
    }
    @Test
    void testMultiply2(){ assertEquals(24,Calculator.multiply(3,4,2)); }

}
