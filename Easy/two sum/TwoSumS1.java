public class TwoSumS1 {
    // we got an arrays of numbers and a target number,
    //  we need to find the indices of the two numbers that add up to the target number.
    // we will use a brute force approach to solve this problem.
    

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
        public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 26;
        
        // this is a where we store the result of the twosum function, which will return the indices of the two numbers that add up to the target number.
        int[] result = twosum(numbers, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] twosum(int[] numbers, int target) {
        int arraylength = numbers.length;
        //inner loop starts from i+1 to avoid checking the same pair twice and to avoid using the same element twice.
        for (int i = 0; i < arraylength - 1; i++) {
            for (int j = i + 1; j < arraylength; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i, j}; //this will return the indices of the two numbers that add up to the target number.
                }
            }
        }
        
        return new int[] {-1, -1}; //this will return -1, -1 if no such pair is found.
        
    }
}