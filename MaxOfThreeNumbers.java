public class MaxOfThreeNumbers {

    public static void main(String[] args) {
    int a = 1, b = 2, c = 3;
    int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    System.out.println("The highest number is"+max);
    }
   }

