/**
 * The difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * @Matt Sauer
 * @8/1/15
 */
public class Project6 extends Project
{
    public void execute()
    {
        showMessage("the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is: " + difference(100));
    }
    
    public int sumOfSquares (int max)
    {
        int sum = 0;
        for (int x = 1; x < max + 1; x++)
        {
            sum += x*x;
        }
        return sum;
    }
    
    public int squareOfSums(int max)
    {
        int square = 0;
        for(int x = 1; x < max+1; x++)
        {
            square +=x;
        }
        square = square * square;
        return square;
    }
    
    public int difference(int max)
    {
        return squareOfSums(max) - sumOfSquares(max);
    }
}
