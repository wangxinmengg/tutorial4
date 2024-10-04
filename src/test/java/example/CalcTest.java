package example;

import org.example.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
  Calc c = new Calc();

    /**
     * 测试加法
     */
    @Test
    void testAddition(){
        assertEquals(4, c.add(2,2));
    }

    /**
     * 测试乘法
     */
    @Test
    void testSubtraction(){
        assertEquals(1, c.subtract(3,2));
    }


}
