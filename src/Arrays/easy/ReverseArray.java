package Arrays.easy;

public class ReverseArray {
    public static void reverse(int arr[]){
        int n = arr.length;
        int left =0;
        int right = n-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {34,56,98,76,98};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" ");
            System.out.print(arr[i]);
        }

    }
}
