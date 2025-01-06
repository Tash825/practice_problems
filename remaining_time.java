import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
        int mins = (h*60) + m;
        int remMin = (24*60) - mins;
        int remH = remMin/60;
        int remM = remMin%60;
        System.out.print(remH + " "+ remM);
    }
}
