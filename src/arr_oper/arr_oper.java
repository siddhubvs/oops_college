package arr_oper;

import java.util.Scanner;

public class arr_oper {
    int arr[];
    Scanner sc=new Scanner(System.in);
    public arr_oper() {
    }

    public arr_oper(int rows) {
        arr=new int[rows];
    }
    public void fillmatrix(){

        System.out.println("enter matrix elements");
        for (int i=0;i<arr.length;i++)

                arr[i]=sc.nextInt();
    }
    public void display(){
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

    }
    public int arraysum(){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];}
        return sum;
    }
    public double average(){
        int sum=0;
        for (int i=0;i<arr.length;i++)
            sum=sum+arr[i];
        double average=sum/arr.length;
        return average;
    }
    public int max(){
        int max=arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public int min(){
        int min=arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public int search(){
        int ele;
        System.out.println("enter element to be searched");
        ele=sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if(arr[i] == ele)
                return i;

        }
        return -1;
    }
    public void binarysearch(){

        for(int i=arr.length-1;i>0;i--){
            for (int j=arr.length-i-1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
