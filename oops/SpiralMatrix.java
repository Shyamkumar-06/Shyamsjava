import java.util.*;

 class SpiralMatrix {
    public static void printSpiral(int[][] mat, int m, int n) {
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
        
            for (int i = left; i <= right; i++) {
                result.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(mat[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printSpiral(mat, 4, 4);
    }
}
