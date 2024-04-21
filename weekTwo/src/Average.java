public class Average {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8 ,  10, 2, 12, 14 , 16  , 18 };
//        int[] arr = {10, 20, 30, 40, 50};
        double theSum = findSum(arr);
        double avg = findAverage(theSum , arr.length);
        printAverage(avg,theSum);
    }

    private static void printAverage(double avg, double theSum) {
        System.out.println("the sum of the array is : "+theSum );
        System.out.println("the average of the array is : "+avg);
    }

    private static double findAverage(double theSum, int length) {
        double avg = theSum/length;
        return avg;
    }

    private static double findSum(int[] arr) {
        double sum = 0 ;
        for(int x : arr)
        {
            sum += x;
        }

        return sum;
    }
}
