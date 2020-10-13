package findMedianSortedArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class mainTest {

    @Test
    void findMedianSortedArrays1() {
//        Input: nums1 = [1,3], nums2 = [2]
//        Output: 2.00000
//        Explanation: merged array = [1,2,3] and median is 2
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        assertEquals(2.00000d, main.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays2() {
//        Input: nums1 = [1,2], nums2 = [3,4]
//        Output: 2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        assertEquals(2.50000d, main.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays3() {
//        Input: nums1 = [0,0], nums2 = [0,0]
//        Output: 0.00000
        int[] nums1 = {0, 0};
        int[] nums2 = {0, 0};

        assertEquals(0.00000d, main.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays4() {
//        Input: nums1 = [], nums2 = [1]
//        Output: 1.00000
        int[] nums1 = {};
        int[] nums2 = {1};

        assertEquals(1.00000d, main.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays5() {
//        Input: nums1 = [2], nums2 = []
//        Output: 2.00000
        int[] nums1 = {2};
        int[] nums2 = {};

        assertEquals(2.00000d, main.findMedianSortedArrays(nums1, nums2));
    }
}