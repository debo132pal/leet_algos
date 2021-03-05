package com.algos;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0 || nums1.length < m + n)
            return;
        int endM = m - 1;
        int endN = n - 1;
        int i = nums1.length - 1;
        while (i >= 0) {
            if( endM < 0 ){
                nums1[i] = nums2[endN];
                endN--;
            } else if ( endN < 0 ){
                nums1[i] = nums1[endM];
                endM--;
            } else if (nums1[endM] < nums2[endN]) {
                nums1[i] = nums2[endN];
                endN--;
            } else if (nums1[endM] >= nums2[endN]) {
                nums1[i] = nums1[endM];
                endM--;
            } else if (endM < 0) {
                nums1[i] = nums2[endN];
                endN--;
            } else {
                nums1[i] = nums1[endM];
                endM--;
            }
            i--;
        }

    }
}
