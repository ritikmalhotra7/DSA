import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Node;

import java.sql.SQLOutput;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5,6,7,1,2,3,4};
        System.out.println(binaryOnRotated(arr,1));
    }
//    private static Pair simpleLinearSearch(int[] arr)
//    private static Pair divideAndConquer()
//    private static int[] twoPointerApproach(int[] arr)
//    private static int dynamicProgramming(int[] arr)
/*    private static int kadaneAlgorithm(int[] arr){
        int maxSoFar = Integer.MIN_VALUE, maxEnd = 0;
        for(int i = 0; i < arr.length; i++){
            maxEnd = maxEnd +arr[i];
            if(maxSoFar<maxEnd){
                maxSoFar = maxEnd;
            }
            if(maxEnd<0) {
                maxEnd = 0;
            }
        }
        return maxSoFar;
    }*/
//    private static boolean HashMapOrSetApproach(int[] arr)
    private static int binaryOnRotated(int[] arr, int m){
        int pivot = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]>arr[i+1]){
                pivot = i;
                break;
            }
        }
        return pivot;
    }
}