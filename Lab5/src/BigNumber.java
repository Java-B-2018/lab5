import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumString = scanner.next();
        String secNumString = scanner.next();
        scanner.close();

        int firstNum[];
        int secondNum[];

        //your code here

        print(add(firstNum, secondNum));
        print(sub(firstNum,secondNum));
        print(multiply(firstNum,secondNum));
    }

    /**
     * You should complete addition operation.
     * The variable result should be the result of addition operation.
     * @param first
     * @param second
     * @return
     */
    public static int[] add(int[] first, int[] second){
        int[] result;
        //your code here
        return result;
    }

    /**
     * You should complete subtraction operation.
     * @param first
     * @param second
     * @return
     */
    public static int[] sub(int[] first, int[] second){
        int[] result;
        //your code here
        return result;
    }

    /**
     * You should complete multiplication operation.
     * @param first
     * @param second
     * @return
     */
    public static int[] multiply(int[] first, int[] second){
        int[] result ;
        //your code here
        return result;
    }

    /**
     * You can use this method to print a array as a number.
     * @param bigNum
     */
    public static void print(int[] bigNum){
        //your code here
    }
}
