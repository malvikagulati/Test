import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("enter any four no");
        Scanner sc = new Scanner(System.in);
        int a = getIntFromString(sc.next());
        int b = getIntFromString(sc.next());
        int c = getIntFromString(sc.next());
        int d = getIntFromString(sc.next());
        printSmallestNumber(a,b,c,d);

    }

    private static void printSmallestNumber(int a, int b, int c, int d) {
        if (a < b && a < c && a < d) {
            System.out.println("Smallest number is: " + a);
        } else if (b < a && b < c && b < d) {
            System.out.println("Smallest number is: " + b);
        } else if (c < a && c < b && c < d) {
            System.out.println("Smallest number is: " + c);
        } else if (d < a && d < b && d < c) {
            System.out.println("Smallest number is: " + d);
        }
    }

    private static int getIntFromString(String no) {
        try {
            int no1= Integer.parseInt(no);
            return no1;
        }catch (Exception e){
            System.out.println(no+" is not a valid input");
            System.exit(1);
            return -1;
        }
    }
}