package Arrays;

public class Q1_SumAndAverage {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

/*
Compile the code: javac Arrays\Q1_SumAndAverage.java
Run the code: java Arrays.Q1_SumAndAverage
 */