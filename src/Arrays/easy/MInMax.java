package Arrays.easy;

public class MInMax {
    public static void minmax(int arr[]){

        int max= arr[0];
        int min= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];

            }else if(arr[i]<min){
                min= arr[i];

            }

        }
        System.out.println("Min "+min);
        System.out.println("Max "+max);




    }
    static void main(String[] args) {
        int arr[] = {34,56,98,76,98};
        minmax(arr);

    }
}
