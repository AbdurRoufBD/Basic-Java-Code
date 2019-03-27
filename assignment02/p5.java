import java.util.Scanner;

public class p5 {

    public static int reverse(int number)
    {
        String str = Integer.toString(number);
        char[] numberInchar = str.toCharArray();
        int len = str.length();

        for(int i = 0; i < (len/2) ;i++)
        {
            char temp = numberInchar[i];
            numberInchar[i] = numberInchar[len-i-1];
            numberInchar[len-i-1] = temp;
        }

        str = String.valueOf(numberInchar);
        Integer result = Integer.valueOf(str);
        return result;
    }

    public static boolean isPalindrome(int number)
    {
        String str = Integer.toString(number);

        int len = str.length();

        for(int i = 0; i < (len/2) ;i++)
        {
            if(str.charAt(i) != str.charAt(len-i-1)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        //System.out.println( isPalindrome(n));

        System.out.println("Reverse of :: "+n+" is :: "+reverse(n));

        if(isPalindrome(n))
        {
            System.out.println("Given Number :: "+n+" is Palindrome");
        }
        else
        {
            System.out.println("Given Number :: "+n+" isn't Palindrome");
        }


    }
}
