public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else if(ch=='$')
            System.out.println(ch + " is invalid");
        else
            System.out.println(ch+ "is consonant");

    }
}
