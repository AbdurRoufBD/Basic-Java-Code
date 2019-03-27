import java.util.Scanner;

public class p7 {

    /** Return true if the card number is valid */
    public static boolean isValid(long number)
    {
        int numberLength = getSize(number);

        if(numberLength < 13 || numberLength > 16 ) return false;                                                                                       //digit length checking
        if(!(prefixMatched(number,4) || prefixMatched(number,5) || prefixMatched(number,6) || (getPrefix(number,2) == 37))) return false;
        int sum1 = sumOfDoubleEvenPlace(number);
        int sum2 = sumOfOddPlace(number);

        int sum = sum1+sum2;

        //System.out.println("Sum1 = "+sum1+" sum2 = "+sum2 + " Sum = "+sum);
        if(sum%10 == 0) return true;
        else return false;
        ///return true;
    }
    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number)
    {
        String str = Long.toString(number);

        int sum = 0;

        int len = str.length();

        for(int i = 0; i < len ;i=i+2)
        {
            int x = str.charAt(i) - '0';
            x = x*2;
            sum = sum + getDigit(x);
        }
        return  sum;
    }
    /** Return this number if it is a single digit, otherwise, return the sum of the two digits */
    public static int getDigit(int number)
    {
        if(number>9) return (number%10)+1;
        else return number;
    }
    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number)
    {
        String str = Long.toString(number);

        int sum = 0;

        int len = str.length();

        for(int i = len -1 ; i >= 0 ;i=i-2)
        {
            int x = str.charAt(i) - '0';
            sum = sum + x;
        }
        return  sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d)
    {
        String str = Long.toString(number);
        if(str.charAt(0) == d + '0') return true;
        else return  false;
    }
    /** Return the number of digits in d */
    public static int getSize(long d)
    {
        String str = Long.toString(d);
        return str.length();
    }
    /** Return the first k number of digits from number. If the number of digits in number is less than k,
     return number. */
    public static long getPrefix(long number, int k)
    {
        String str = Long.toString(number);
        if(str.length() <= k) return number;
        else return Long.parseLong(str.substring(0,k));
    }
    public static void main(String[] args) {
        //System.out.println(getPrefix(1234567,10));
        //System.out.println(prefixMatched(1234567,1));
        //System.out.println(sumOfOddPlace(12345678));
        //System.out.println(sumOfDoubleEvenPlace(1234567));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Credit card Number as a long Integer : ");
        Long x = sc.nextLong();

        if(isValid(x))
        {
            System.out.println(x+" is Valid");
        }
        else
        {
            System.out.println(x+" is Invalid");
        }
        //for credit card first digit should be 4


    }
}
//4388576018410707 is valid
//4388576018402626 is invalid
