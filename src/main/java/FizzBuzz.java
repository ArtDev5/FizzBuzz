public class FizzBuzz {

    public String getFizzBuzz(int number){
        if(number % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
