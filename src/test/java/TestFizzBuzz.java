import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {

    @Test
    public void testNumber4FizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(4);
        assertEquals("4", result);
    }

    @Test
    public void testFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void testBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void testFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(15);
        assertEquals("FizzBuzz", result
        );
    }
}
