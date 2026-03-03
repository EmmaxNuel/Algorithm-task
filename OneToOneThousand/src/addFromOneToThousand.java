public class addFromOneToThousand {
    public static int addFromOneToThousand(){
        int sum = 0;
        for(int count = 0; count <= 1000; count++){
          sum += count;
        }
        return sum;
    }

    public static int addFromOneToMillion(){
        int sum = 0;
        for(int count = 0; count <= 1000000; count++){
            sum += count;
        }
        return sum;
    }

    static void main() {
        String star = "*";
        System.out.println("The sum of numbers from 1 - 1000:" + addFromOneToThousand());
        System.out.println("The sum of numbers from 1 - 1000000: "+ addFromOneToMillion());
        }

    }

