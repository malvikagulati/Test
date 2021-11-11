import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter days in month- ");
        int m = sc.nextInt()% 7;
        switch(m){
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
                case 5:
                System.out.println("Day is Friday");
                    break;
                case 6:
                System.out.println("Day is Saturday");
                break;
            case 0:
                System.out.println("Day is Sunday ");




        }
    }
}
