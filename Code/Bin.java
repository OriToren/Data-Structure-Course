public class Bin{
private static Boolean search(int[] array, int target, int start, int end) {

    if (start > end) {

        return false;

    }

    int mid = start + (end - start) / 2;

    int midValue = array[mid];

    if (midValue == target) {

        return true;

    }

    if (target < midValue) {

        return search(array, target, start, mid - 1);

    } else {

        return search(array, target, mid + 1, end);

    }

}





public static Boolean recrusive_search(int[] array, int target) {



    if (array == null || array.length == 0) {

        return false;

    }





    return search(array, target, 0, array.length - 1);

}

public static Boolean normalsearch(int[] array, int target){

    if (array == null || array.length == 0) {

        return false;

    }

    int start=0;

    int end=array.length-1;

    int mid=start+(end-start)/2; //this i needed help to find how to do eachtime

    while (target != array[mid]){

        if (end-start<=1 && array[start] != target && array[end] != target){

            return false;

        }

        mid=start+(end-start)/2;

        if (target>array[mid]){

            start=mid+1;

            continue;

        }

        if (target<array[mid]){

            end=mid-1;

            continue;

        }



    } return true;



}

}