package PracticeClass1;

public class Que19 {
    public static int findmax(int arr[], int n){
        int max = Integer.MIN_VALUE, index =-1;

        for(int i =0; i<n ; i++){
            if( arr[i]> max);
            max = arr[i];
            index = i;
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 1};
        int index =arr.length, c=0;

        while (index != 0 ){
            index = findmax(arr , index);
                    c++;
        }
        System.out.println(c);

    }

}
