import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {


    @Test
    void testThat2FactorialIs2(){
        int input = 6;
        int result = Factorial.getFactorial(input);
        assertEquals(720,result);
    }

}
