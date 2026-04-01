package Arrays.easy;

public class CyclicRotateOne {
    public static void reverse(int arr[]){
        int n= arr.length;
        int left =0;
        int right= n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
        }
    }
    static void main(String[] args) {
        int arr[]= {45,78,65,98};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
