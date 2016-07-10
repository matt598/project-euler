package svc;
/**
 * Created on 7/9/16.
 * Goal of Project:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * The goal of this project is to:
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Project_1 extends Project{
    private int sum;
    public void execute(){
        sum = 0;
        add(3,1000);
        add(5,1000);
        remove(15,1000);
        showMessage("" + sum) ;
    }

    private void add(int multiple, int limit){//adds all instances of multiple to the sum
        for(int x = 0; x < limit; x+= multiple)
        {
            sum += x;
        }
    }

    private void remove(int multiple, int limit){//removes all instances of multiple from the sum
        for(int x = 0; x < limit; x+= multiple){
            sum -= x;
        }
    }
}
