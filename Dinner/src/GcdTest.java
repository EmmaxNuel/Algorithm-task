import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdTest {

    @Test
    void testThatInputIs2And4GcdIs2(){
        int firstInput = 2;
        int secondInput = 4;
        int result = Gcd.findGcd(firstInput,secondInput);
        assertEquals(2,result);
    }


}