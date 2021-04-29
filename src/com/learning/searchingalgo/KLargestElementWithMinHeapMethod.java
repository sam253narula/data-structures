package com.learning.searchingalgo;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//K largest elements from a big file or array.

public class KLargestElementWithMinHeapMethod {

    public static PriorityQueue<Integer> kLargest(int arr[], int n, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k ; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if(minHeap.peek() > arr[i])
                continue;

            else{
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }

        return minHeap;
    }

    public static void main(String[] args) {
        int[] arr = {34,4545,65,65,76,67,66,34,3};
        System.out.println(kLargest(arr, arr.length,2));
    }
}
