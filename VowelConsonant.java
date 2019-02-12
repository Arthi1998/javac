import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        System.out.println("Enter your ch:");
        Scanner reader = new Scanner(System.in);
    char ch= reader.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else if(ch=='$')
            System.out.println(ch + " is invalid");
        else
            System.out.println(ch+ "is consonant");

    }
}
