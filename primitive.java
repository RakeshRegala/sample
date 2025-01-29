import java.util.*;
class sort{
    int search(int a[],int key,int n){
        int low=0,high=n-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(key==a[mid]){
                return mid;
            }
            else if(key>a[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            }
            return -1;
        }
    }
public class primitive{
    public static void main(String[] args){
        sort obj=new sort();
        Scanner sc=new Scanner(System.in);
        int n,key;
        int a[]=new int[10];
        System.out.println("Enter no of elements: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter key: ");
        key=sc.nextInt();
        int pos=obj.search(a,key,n);
        System.out.println("Found at: "+pos);
    }
}