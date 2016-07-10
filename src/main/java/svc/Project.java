package svc;
import java.util.*;

abstract class Project {
    Project(){

    }

    public void execute(){

    }
    protected void showMessage(String message){
        System.out.println("" + message);
    }

    protected String showMessageAndGetResponse(String message){
        Scanner user = new Scanner(System.in);
        String response = user.nextLine();
        user.close();
        return response;
    }
}

