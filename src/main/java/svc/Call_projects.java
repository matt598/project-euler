package svc;
import java.util.*;

public class Call_projects {
    public static void main(String [] args){
        Scanner user = new Scanner(System.in);
        System.out.println("Select which project you want to run");
        Project selectedProject = pickProject(user.nextInt());
        selectedProject.execute();
    }


    private static Project pickProject(int selected_project){
        switch (selected_project) {
            case 1:
                return new Project_1();
            default:
                return new Project_default();
        }
    }
}
