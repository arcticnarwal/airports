package findMedianSortedArrays;

public class main {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int combinedLength = nums1.length + nums2.length;
        int dividend = combinedLength / 2;
        int[] combined = new int[combinedLength];

        while (i < nums1.length || j < nums2.length) {
            if (i >= nums1.length) {
                combined[k] = nums2[j];
                ++j;
            } else if (j >= nums2.length) {
                combined[k] = nums1[i];
                ++i;
            } else if (nums1[i] <= nums2[j]) {
                combined[k] = nums1[i];
                ++i;
            } else if (nums1[i] > nums2[j]) {
                combined[k] = nums2[j];
                ++j;
            } else {
                break;
            }
            ++k;
        }

        if (combinedLength % 2 != 0) {
            return combined[dividend] / 1.00000d;
        } else {
            return (combined[dividend] + combined[dividend - 1]) / 2.00000d;
        }
    }
}
