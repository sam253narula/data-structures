package com.learning.searchingalgo;


import java.util.*;

// K largest elements from a big file or array.

class KLargestElementsInArray
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // below method works for pre determined number of k
//        ArrayList<Integer> result = new ArrayList<>();
//        int first=0;
//        int second=0;
//        for(int i =0; i < n;i++){
//            if(arr[i] > first){
//                first = arr[i];
//            }
//            else if(arr[i] > second){
//                second = arr[i];
//            }
//        }
//        result.add(first);
//        result.add(second);

        // below method works for any k
        ArrayList<Integer> result = new ArrayList<>();
        Integer[] obj_arr = Arrays.stream(arr).boxed().toArray(Integer[] ::new);

        Arrays.sort(obj_arr, Collections.reverseOrder());
        for(int i = 0; i< k; i++)
            result.add(obj_arr[i]);
        return result;
    }

    public static void main(String[] args) {
        int[] arr  = {12,34,34,3,543,4,34,3,4534,4,5,4,4,54,5,65};
        System.out.println(kLargest(arr, arr.length, 3));
    }
}