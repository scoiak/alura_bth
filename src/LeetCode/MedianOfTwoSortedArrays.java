package LeetCode;

import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public double solucao(int[] nums1, int[] nums2){
        double output;
        int fullSize = (nums1.length + nums2.length);
        int[] mergedArray = new int[fullSize];

        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, 0 + nums1.length, nums2.length);

        mergedArray = Arrays.stream(mergedArray).sorted().toArray();
        System.out.println(Arrays.toString(mergedArray));

        output = mergedArray.length % 2 == 0
                ? ((double)mergedArray[mergedArray.length / 2 - 1] + (double)mergedArray[mergedArray.length / 2]) / 2
                : mergedArray[(int) (mergedArray.length / 2)];

        return output;
    }
}
