import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int mins = (h*60) + m;
        int remMin = (24*60) - mins;
        int remH = remMin/60;
        int remM = remMin%60;
        System.out.print(remH + " "+ remM);
    }
}
