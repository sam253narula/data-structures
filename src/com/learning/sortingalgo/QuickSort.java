package com.learning.sortingalgo;


import java.util.Arrays;
import java.util.Random;

/**
 * 1) Select a Pivot, We will compare other items in the array with the pivot,
 * move items < pivot to the left of the Pivot
 * move item > pivot to the right of the Pivot
 * Now we will have left Partition and right Partition
 * 2) Select Upper index and lower Index items
 * 3) Now Start comparing from the left, if left item > pivot, if No then increment upper index pointer and compare again,
 * then start comparing on the right, if the right item < pivot,if No then increment lower index pointer and compare again
 * if both conditions satisfied, then swap upper and lower index and increment both pointers
 * Continue the process, until both the upper an lower index pointers meet each other
 * Now point the lower index pointer to pivot position and then swap the lower and upper index
 * Now you will see that item to right of the swapped pivot will be greater
 * and all items to the left of the swapped pivot will be greater then the pivot.
 * <p>
 * 4)  Now we will call quicksort() on the left partition and on the right partition
 * <p>
 * Left Partition                Right Partition
 * All < Pivot                    All > Pivot
 * <p>
 * Quick Sort Summary:
 * QuickSort is recursive.
 * Divide and Conquer Algorithm
 * very efficient for large data sets
 * <p>
 * Big Oh Analysis
 * Worst case is O(n^2)
 * Average case is O(n log n)
 * Performance depends on Pivot selection.
 * <p>
 * Different pivot selection
 * Select first item in list.
 * Select last item in list. ( both wil have bad performance)
 * Select Middle item ( will have good performance)
 * Select median(middle value) value of first, last and middle utem in the list
 * Randomly Select Pivot ensure O(n log n)
 * <p>
 *     int[] A  = {4,7,2,8,4,3,67,88,43,3,6,7,3};
 * 0  1 2  3  4 5  6  7  8
 * low index  = 0 , high index = 8
 */

public class QuickSort {

    public void quickSort(int[] A) {
        // Passing the lower and upper index
        quickSort(A, 0, A.length - 1);
    }

    // Below is our recursive method
    private void quickSort(int[] A, int low, int high) {
        // this if condition ensures there is more than one item left to sort in the list
        if (low < high + 1) {
            // We get the new pivot index
            int p = parititon(A, low, high);
            // Then we call quick sort on the left and the right partition
            quickSort(A, low, p - 1);
            quickSort(A, p + 1, high);

        }
    }

    // Utility function to swap two values
    private void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    // Returns random pivot index between low and high inclusive
    private int getPivot(int low, int high) {
        Random random = new Random();
        int p = random.nextInt((high - low) + 1) + low;
        return p;
    }

    /**
     * Moves all values < pivot to the left of the pivot and
     * all values > pivot to the right of the pivot
     */
    private int parititon(int[] A, int low, int high) {
        // below swap function swaps the value of the pivot to the left most position
        int pivot = getPivot(low, high);
        swap(A, low, pivot);
        //set the border, which is our left pointer, it is just to the right of our Pivot position
        int border = low + 1;
        // Iterate over the array and compare each item to the pivot value,
        //Pivot is A[low]
        for (int i = border; i <= high; i++) {
            if (A[i] < A[low]) {
                swap(A, i, border++);
            }
        }
        // when we are done, we will swap the pivot value to its proper positiom
        swap(A, low, border - 1);
        return border - 1;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
      //  int[] A = {9, 0, 1, 3, 46, 5, 2, 9, 8, 7, 6, 5, 9, 1, 0, 9};
        int[] A  = {4,7,2,8,4,3,67,88,43,3,6,7,3};
        System.out.println(Arrays.toString(A));
        quickSort.quickSort(A);
        System.out.println(Arrays.toString(A));
    }

}
