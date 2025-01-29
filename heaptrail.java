import java.io.*;
public class heaptrail {

    static void heap(int a[]){
        int n=a.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }

        for(i=n-1;i>0;i--){
            int temp;
            temp=a[i];
            a[i]=a[large];
            a[large]=temp;
            heapify(a, i, 0);
        }
    }

    static void heapify(int a[],int n,int i){
        int large=i;
        int l=(2*i)+1;
        int r=(2*i)+2;
        if(a[l]>a[large]){
            large=l;
        }
        if(a[r]>a[large]){
            large=r;
        }
        if(large!=i){
            int temp;
            temp=a[i];
            a[i]=a[large];
            a[large]=temp;
            heapify(a,n,large);
        }
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver's code
    public static void main(String args[]) {
        int arr[] = {9, 4, 3, 8, 10, 2, 5}; 
        heapSort(arr);
        System.out.println("Sorted array is ");
        printArray(arr);
    }
}

