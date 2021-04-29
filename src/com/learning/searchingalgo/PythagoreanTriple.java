package com.learning.searchingalgo;

import java.util.Arrays;

//Method 2 (Use Sorting)
//We can solve this in O(n2) time by sorting the array first.
//1) Do square of every element in input array. This step takes O(n) time.
//2) Sort the squared array in increasing order. This step takes O(nLogn) time.
//3) To find a triplet (a, b, c) such that a2 = b2 + c2, do following.
//
//Fix ‘a’ as last element of sorted array.
//Now search for pair (b, c) in subarray between first element and ‘a’. A pair (b, c) with given sum can be found in O(n) time using meet in middle algorithm discussed in method 1 of this post.
//If no pair found for current ‘a’, then move ‘a’ one position back and repeat step 3.2.
//Time complexity of this method is O(n2).
public class PythagoreanTriple {
    private static boolean triple(int[] arr, int n){
        // 1) Square all elements in array
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]*arr[i];
        }
        //Sort all elements in array in natural order
        Arrays.sort(arr);

        for (int i = n-1; i >= 2; i--) {
            int l = 0;
            int r = i-1;

            while (l < r){
                if(arr[l] + arr[r] == arr[i]){
                    return true;
                }
                else if(arr[l] + arr[r]  < arr[i]){
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 6, 5 };
        System.out.println( triple(arr, 5));
    }
}
