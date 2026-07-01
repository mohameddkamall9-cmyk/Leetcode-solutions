package Easy.ConcatenateOfArrays;
public class Concate {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        // calling the concatenateArrays method and printing the result
        int[] result = concatenateArrays(nums1);
        int[] result2 = concatenateArrays(nums2);

        // printing the results
        System.out.println("Result 1:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Result 2:");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        
    }

    public static int[] concatenateArrays(int[] nums) {
         //creating a new array with double the length of the input array
        int[] C = new int [nums.length * 2];
        
        for (int i= 0; i<C.length; i++){
            
            C[i] = nums[i%nums.length];
            
        }

        return C;
}
}
