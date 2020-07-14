public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(1376796946));
    }

    public static int solution(int N) {
        int maxGap = 0;
        int currentGap = 0;
        boolean startGap = false;
        while (N != 0) {
            if (N % 2 == 1) {
                if (currentGap > maxGap) {
                    maxGap = currentGap;
                }
                currentGap = 0;
            } else {
                if (startGap) {
                    currentGap++;
                }
            }
            N = N >> 1;
        }
        return maxGap;
    }
}
