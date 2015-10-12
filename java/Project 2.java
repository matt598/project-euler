/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * @Matt Sauer
 * @7/30/15
 */
public class Project2 extends Project
{
    public void execute()
    {
        showMessage(""+findSumOfEvenTerms(createFib(1, 2))) ;
    }
    
    public int [] createFib(int firstTerm, int secondTerm)
    {
        int terms [] = new int[35];
        int currentValue = secondTerm;
        int counter = 3;
        terms[1] = firstTerm;
        terms[2] = secondTerm;
        while(currentValue < 4000000)
        {
            terms[counter] = terms[counter-1] + terms[counter -2];
            currentValue = terms[counter];
            counter++;
        }
        System.out.println("counter = " + counter);
        terms[0] = counter;
        return terms;
    }
    
    public int findSumOfEvenTerms(int [] terms)
    {
        int sum = 0;
        for(int x = 2; x < terms[0]; x+=3)//doing it this way because every 3rd term is even. Will work on effiecency later. Also 1st term is the number that auctually matter.
        {
            if(terms[x] %2 == 0)
            {
                sum += terms[x];
            }
            if(terms[x] == 0)
            {
                break;
            }
        }
        return sum;
    }
}
