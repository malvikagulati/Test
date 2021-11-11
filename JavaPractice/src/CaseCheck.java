import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("Enter any Alphabet");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        checkCharacter(ch);
    }

    public static void checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "character is in uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " character is in lowercase");
        } else {
            System.out.println(ch + " character is not a expected character");
        }
    }


    }

