package org.example.Recursion;

public class BinarySearch {

    public static int binary(int [] arr , int target,int start,int end){

         if(start >end) {
             return -1;
         }
         int mid=start+(end-start)/2;

         if(arr[mid]==target){
                return mid;
            } else if (target>arr[mid]) {
               return binary(arr,target,mid+1,end);
            }else{
               return binary(arr,target,start,mid-1);
            }
    }

    public static void main(String[] args) {
    int [] arr={10,20,30,40,50};
    int ans= BinarySearch.binary(arr,50,0,arr.length-1);
        System.out.println(ans);
    }
}
