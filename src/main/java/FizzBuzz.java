public class FizzBuzz {

    public String getFizzBuzz(int number){
        if(number % 15 == 0){
            return "FizzBuzz";
        }else if(number % 3 == 0 || String.valueOf(number).contains("3")){
            return "Fizz";
        }else if(number % 5 == 0 || String.valueOf(number).contains("5")){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
