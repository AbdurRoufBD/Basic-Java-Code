public class p6 {

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

    public static boolean isPrime(int number)
    {
        if(number == 1) return false;

        for(int i = 2; i*i <= number ; i++)
        {
            if(number%i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int n = 100; // number of 100 palindromic prime Number

        int counter = 0;

        int rowcounter = 0; // 10 number in a row

        int i = 1;
        while(counter < n)
        {
            if(isPalindrome(i) && isPrime(i))
            {
                System.out.print(i+" ");
                counter++;
                rowcounter++;
            }

            if(rowcounter == 10 )
            {
                System.out.println();
                rowcounter = 0;
            }

            i++;
        }

    }
}
