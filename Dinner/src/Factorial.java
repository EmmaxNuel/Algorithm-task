public class Factorial {



    public static int getFactorial(int input){
        int count = input - 1;
        while(count > 0){
            input = input * count;
            count--;
        }
        return input;
    }

}
