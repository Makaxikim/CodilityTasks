import java.util.Arrays;

/*
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/

public class MissingInt {
    public static void main(String[] args) {
        //int[] a = {1, 3, 6, 4, 1, 2};
        int[] a = {1};
        System.out.println(solution(a));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int positiveIndex = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                positiveIndex = i;
                break;
            }
        }
        if (positiveIndex == -1 || A[positiveIndex] > 1) {
            return 1;
        } else {
            for (int i = positiveIndex; i < A.length - 1; i++) {
                if (A[i + 1] - A[i] > 1) {
                    return A[i] + 1;
                }
            }
        }
        return A[A.length - 1] + 1;
    }
}
