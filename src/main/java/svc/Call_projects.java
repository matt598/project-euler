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
            case 2:
                return new Project_2();
            case 4:
                return new Project_4();
            case 6:
                return new Project_6();
            case 44:
                return new Project_44();
            default:
                return new Project_default();
        }
    }
}
