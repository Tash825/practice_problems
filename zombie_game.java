//zombie game
import java.util.*;
class Zombie_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        long z [] = new long[n];
        for(int i=0;i<n;i++){
            z[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            b = (z[i]%2)+(z[i]/2);
            if(b<0){
                System.out.print("NO");
            }else{
                System.out.print("YES");
            }
        }
    }
}
