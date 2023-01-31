package org.example;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Armstrong {
    @Test
    public void testIsArmstrongNumber() {
        assertTrue(isArmstrongNumber(153));
        assertTrue(isArmstrongNumber(371));
        assertTrue(isArmstrongNumber(407));
        assertFalse(isArmstrongNumber(100));
        assertFalse(isArmstrongNumber(123));
    }

    public static boolean isArmstrongNumber(int n) {
        int originalN, remainder, result = 0;
        int c = 0;
        originalN = n;

        while (originalN != 0) {
            originalN /= 10;
            ++c;
        }

        originalN = n;

        while (originalN != 0) {
            remainder = originalN % 10;
            result += Math.pow(remainder, c);
            originalN/= 10;
        }

        return n == result;
    }
}
