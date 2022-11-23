import java.util.Scanner;

public class Search {

    public static int Search(int size,int search,int[]a){
        int flag=0;
        for (int i=0;i<size;i++){
            if (a[i]==search){
                    flag=1;
            }
        }
        return flag;
    }
    public static int[] sort(int size,int[]arr) {
        for (int i = 0; i < size-1; i++) {
            for (int j = i + 1; j < size; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter elements to array ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number to search");
        int s=sc.nextInt();
        int f=Search(size,s,a);
        if (f==1){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element Not found");
        }
        System.out.println("\nThe sorted array:");
       int  sortarr[]=sort(size,a);
        for (int i=0;i<size;i++){
            System.out.println(sortarr[i]+"\t");
        }
    }
}
