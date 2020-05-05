import java.util.Scanner;

public class arraymax {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=s.nextInt();}
            System.out.println(maxarr(arr));
        }
    public static int maxarr(int arr[]) {
        int max = arr[0];
for(int i=0;i<=arr.length-1;i++){
    if(arr[i]>max){
        max=arr[i];
    }
        }
return max;
    }}
