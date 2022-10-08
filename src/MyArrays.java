public class MyArrays {
    public static double avgOf4Digit(int[] A) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] >= 1000 && A[i] <= 9999) {
                sum += A[i];
                counter += 1;
            }
        }
        if (counter == 0) {
            return -1.0d;
        } else {
            return sum / counter * 1.0d;
        }
    }
    public static int[] minToBegin(int[] A) {
        int min = 2147483647;
        int index = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] < min) {
                min = A[i];
                index = i;
            }
        }
        for (int i = index; i > 0; --i) {
            A[i] = A[i - 1];
        }
        A[0] = min;
        if (A[1] == min) {
            int[] x = {-1};
            return x;
        } else {
            return A;
        }
    }
}
