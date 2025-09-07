package Array;

public class SubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5};
        int target = 12;
        int count = 0;
        int size = arr.length;

        for ( int i =0; i < size ; i++){
            int sum =0;
            for ( int j =i; j < size-i; j--) {
                sum = sum + arr[i];
                if ( sum == target){
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}
