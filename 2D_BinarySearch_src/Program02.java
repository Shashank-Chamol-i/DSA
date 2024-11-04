import java.util.Arrays;

public class Program02 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.toString(search(arr, 6)));
    }

    static int[] binarySearch(int[][] matrix, int cStart, int cEnd, int target, int row) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        // If there is only one row, we directly apply binary search on it
        if (row == 1) {
            return binarySearch(matrix, 0, col - 1, target, 0);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;

        // Binary search between rows to reduce the problem to two rows
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid; // move to the lower half
            } else {
                rEnd = mid; // move to the upper half
            }
        }

        // Now we have only two rows to consider: rStart and rStart + 1
        // Check the middle elements of the two rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Now search in 4 parts of these two rows
        // 1st part: Left half of rStart
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, 0, cMid - 1, target, rStart);
        }
        // 2nd part: Right half of rStart
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]) {
            return binarySearch(matrix, cMid + 1, col - 1, target, rStart);
        }
        // 3rd part: Left half of rStart + 1
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, 0, cMid - 1, target, rStart + 1);
        }
        // 4th part: Right half of rStart + 1
        else {
            return binarySearch(matrix, cMid + 1, col - 1, target, rStart + 1);
        }
    }
}
