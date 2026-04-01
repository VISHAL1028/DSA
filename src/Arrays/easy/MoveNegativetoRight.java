package Arrays.easy;

public class MoveNegativetoRight {
    public static void rotate(int arr[]){
        int n= arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]>=0){
                left++;
            }else if(arr[right]<0){
                right--;
            }else {
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }

    static void main(String[] args) {
        int arr []={2, -5, 4, -1, -3, -9};
        rotate(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
