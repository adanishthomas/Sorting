import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {1,-1,2,4,5,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int arr[]){
        //boolean value
        boolean swap;

        for(int i = 0; i<arr.length; i++){
            //if array is already sorted then the value of swap will be false for the first iteration
            swap = false;

            for(int j = 1 ; j< arr.length - i; j++){

                if(arr[j]< arr[j-1]){

                    int temp = arr[j];
                    arr[j]= arr[j -1];
                    arr[j-1]= temp;
                    //if swap operation occurs then swap value becomes true and the code will continue to execute

                    swap = true;
                }

            }
            //if swap is false then break the code since the array is already sorted
            if(!swap){
                break;
            }
        }
    }
}
