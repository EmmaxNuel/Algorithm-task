public class Gcd {
    private static int findSmallest(int firstNumber, int secondNumber){
        int smallest;
        if (firstNumber > secondNumber){
            smallest = secondNumber;
        }

        else {
            smallest = firstNumber;
        }
        return smallest;
    }

    public static int findGcd(int firstInput, int secondInput){
        int smallest = findSmallest(firstInput,secondInput);
        
    }
}
