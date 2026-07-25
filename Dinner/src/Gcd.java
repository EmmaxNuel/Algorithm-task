public class Gcd {

    public static int findGcd(int firstInput, int secondInput) {
        if (secondInput == 0) {
            return firstInput;
        }
        return findGcd(secondInput, firstInput % secondInput);
    }

    public static int findLcm(int firstInput, int secondInput) {
        return (firstInput * secondInput) / findGcd(firstInput, secondInput);
    }

}
