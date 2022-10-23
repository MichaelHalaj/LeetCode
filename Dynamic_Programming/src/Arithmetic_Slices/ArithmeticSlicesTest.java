package Arithmetic_Slices;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class ArithmeticSlicesTest {

    @Test
    void testcase() {
        assertEquals(Arithmetic_Slices.numberOfArithmeticSlices(new int[]{1,2,3,4}), 3);
        assertEquals(Arithmetic_Slices.numberOfArithmeticSlices(new int[]{1}), 0);
        assertEquals(Arithmetic_Slices.numberOfArithmeticSlices(new int[]{1,2,3,4,6,8}), 4);
    }
}

