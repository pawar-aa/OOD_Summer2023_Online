// Author: Aashay Pawar
// NUID: 002134382

package edu.northeastern.csye6200;

public class LAB3_P3 {
	public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 5};
        
        System.out.print("Original nums: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        int uniqueCount = removeDuplicates(nums);
        
        System.out.print("Final nums: [");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i]);
            if (i < uniqueCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1;
        int currentIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[currentIndex] = nums[i];
                currentIndex++;
                uniqueCount++;
            }
        }

        // Fill remaining elements with zeroes
        for (int i = uniqueCount; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums.length;
    }

}


