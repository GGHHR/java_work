package com.work;

import java.util.Arrays;
import java.util.HashMap;

public class sort {
    public static void main(String[] args) {
        bubbleSort();


        System.out.println(Arrays.toString(new sort().twoSum(new int[]{3,1, 2, 3}, 3)));
    }
    static void bubbleSort() {
        int[] arr = {1,0, 2, 3, 6, 4, 5, 8, 7, 8, 4};
        int temp;
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            System.out.println(target - nums[i]+"----"+i);
            map.put(target - nums[i], i);
        }
        return null;
    }
}
