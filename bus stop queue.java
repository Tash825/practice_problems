//bus queue problem
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int bus = 0;
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
            if(sum+arr[i]>m){
                bus++;
                sum =arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        if(sum>0){
            bus++;
        }
        System.out.print(bus);
    }
}
