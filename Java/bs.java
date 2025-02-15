public public class bs {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 12, 18},
            {-4, 36, 91},
            {16, 33, 44}
        };

        int target = 33;
        int[] result = search(matrix, target);
        
        if (result[0] != -1) {
            System.out.println("Element found at row " + result[0] + ", column " + result[1]);
        } else {
            System.out.println("Element not found.");
        }
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols];

            if (midElement == target) {
                return new int[]{mid / cols, mid % cols};
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{-1, -1}; // Target not found
    }
}
 {
    
}
