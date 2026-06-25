package Hard.medianOfAttays;
import java.util.Arrays;

public class bruteForceSolution {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4, 6, 8};
        
        solution(nums1, nums2);
    }

    public static void solution(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int k = 0;
        
        int[] mergedArray = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            mergedArray[k++] = nums1[i];
        }

        for (int i = 0; i < n2; i++) {
            mergedArray[k++] = nums2[i];
        }
        
        Arrays.sort(mergedArray);

        int total = mergedArray.length;
        
        if (total % 2 == 1) {
            System.out.println("Median is: " + (double) mergedArray[total / 2]);
        } else {
            int mid1 = mergedArray[total / 2 - 1];
            int mid2 = mergedArray[total / 2];
            System.out.println("Median is: " + ((double) (mid1 + mid2) / 2.0));
        }
    }
}