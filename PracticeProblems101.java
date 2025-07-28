public class PracticeProblems {
    //1
    static int countOccurences(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }
    //2
    static int[] reverseArray(int[] arr) {
        int[] rra = new int[arr.length];
        for (int i = 0; i<arr.length; i++) {
            rra[i] = arr[arr.length - 1 -i];
        }
        return rra;
    }
    //3
    static int sumGrid(int[][] arr) {
        int sum = 0;
        for (int i = 0; i<arr.length; i++) {
            for(int o = 0; o < arr[i].length; o++) {
                sum += arr[i][o];
            }
        }
        return sum;
    }
    //4 
    static int fib(int n) {
        int a = 1;
        int b = 0;
        int sum = 0;
        if(n == 1) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        else for(int i = 1; i < n - 1; i++) {
            sum = a + b;
            b = a;
            a = sum;

        }
        return sum;
    }
    
}
