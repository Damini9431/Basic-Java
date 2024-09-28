package com.assignment;
import java.util.Arrays;
import java.util.Collections;
public class SubArray {
    public static void main(String[] args) {
		
		int[] array = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};
        int[] subArray = Arrays.copyOfRange(array, 2, 7);
       
        System.out.print("Sub array: ");
        for (int num : subArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        Integer[] subArrayObj = Arrays.stream(subArray).boxed().toArray(Integer[]::new);
        Arrays.sort(subArrayObj, Collections.reverseOrder());
        int secondHighest = subArrayObj[1];
        System.out.println("2nd Highest element: " + secondHighest);
        }
}
