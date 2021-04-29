package com.learning.searchingalgo;

//A simple solution is to run three loops, three loops pick three array elements and check if current three elements form a Pythagorean Triplet.
public class PythagoreanTripleWithWorstTimeComplexity {
    
    private static boolean triple(int[] arr, int n){
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n ; j++) {
                for (int k = j+1; k < n; k++) {
                    int x= arr[i]*arr[i];
                    int y = arr[j]*arr[j];
                    int z = arr[k]*arr[k];
                    if(x == y + z|| y == x + z || z == x+ y){
                        return true;
                    }
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
