/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @Matt Sauer
 * @7/30/15
 */
public class Project4 extends Project
{
    public void execute()
    {
        showMessage("" + makeTheNumbers(999));
    }

    public int makeTheNumbers (int max)
    {
        for(int x = max; x > 0; x--)
        {
            for(int y = max; y>x-1; y--)
            {
                if(palindrome(x * y))
                {
                    return x*y;
                }
                else
                {
                    showMessage("failed at: " + x*y);
                }
            }
        }
        return 0;
    }

    public boolean palindrome(int number)
    {
        String temp = "" + number;
        if(temp.charAt(0) == temp.charAt(temp.length()-1))
        {
            if(temp.charAt(1) == temp.charAt(temp.length()-2))
            {
                if(temp.charAt(2) == temp.charAt(temp.length()-3))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
