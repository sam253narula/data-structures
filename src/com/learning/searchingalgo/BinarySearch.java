package com.learning.searchingalgo;

public class BinarySearch {

    public static int b(int[] A, int x, int l, int r){
        if(l > r){
            throw new RuntimeException();
        }
        int mid  = (l +r)/2;
        if(A[mid] == x){
            return mid;
        }
        else if (x < A[mid]){
            return b(A,x, l, mid-1);
        }
        else{
           return  b(A, x,mid+1, r);
        }

    }

    public static void main(String[] args) {
        int A[] = {2, 3, 3, 3, 4, 4, 6, 7, 7, 8, 43, 67, 88};
       int index =  b(A,6,0, A.length -1);
        System.out.println(index);
    }

}
