package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BuggyMakeChocolateTest {
    MakeChocolate makeChocolateObject;

    @BeforeEach
    public void initialize() {
        makeChocolateObject = new MakeChocolate();
    }

    @ParameterizedTest
    @CsvSource({"4, 1, 9"})
    public void testJustEnoughSmallBars(int small, int big, int goal) {
        int result = new MakeChocolate().makeChocolate(small, big, goal);
        Assertions.assertEquals(4, result);
    }
}
