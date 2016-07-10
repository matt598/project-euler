package svc;
/**
 * Created on 7/9/16.
 */
class Project_1 extends Project{
    private int sum;
    public void execute()
    {
        sum = 0;
        add(3,1000);
        add(5,1000);
        remove(15,1000);
        showMessage("" + sum) ;
    }

    private void add(int multiple, int limit)//adds all instances of multiple to the sum
    {
        for(int x = 0; x < limit; x+= multiple)
        {
            sum += x;
        }
    }

    private void remove(int multiple, int limit)//removes all instances of multiple from the sum
    {
        for(int x = 0; x < limit; x+= multiple)
        {
            sum -= x;
        }
    }
}
