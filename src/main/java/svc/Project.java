package svc;
import java.util.*;
/**
 * Created by sauer on 7/9/16.
 */
public abstract class Project {
    public Project(){

    }

    public void execute(){

    }
    public void showMessage(String message){
        System.out.println("" + message);
    }

    public String showMessageAndGetResponse(String message){
        Scanner user = new Scanner(System.in);
        String response = user.nextLine();
        user.close();
        return response;
    }
}

