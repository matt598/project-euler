import java.util.*;
public class Call
{
    
    public static void Main (String [] args)
    {
        Display display = new Display();
        //int choice = Integer.parseInt(display.showMessageAndGetResponse("What project's answer would you like to see?"));
        Scanner user = new Scanner (System.in);
        System.out.println("");
        while(true)
        {
            int choice = user.nextInt();
            Project current_Project = reallyLongAnnoyingSwitchStatement(choice);
            current_Project.execute();
        }
    }

    public static Project reallyLongAnnoyingSwitchStatement(int choice)
    {
        Project current_Project;
        switch(choice)
        {
            case 1:
            current_Project = new Project1();
            break;
            case 2:
            current_Project = new Project2();
            break;
            /*case 3:
            current_Project = new Project3();//still working on.
            break;*/
            case 4:
            current_Project = new Project4();
            break;
            case 5:
            current_Project = new Project5();
            break;
            case 6:
            current_Project = new Project6();
            break;
            case 7:
            current_Project = new Project7();
            break;
            case 8:
            current_Project = new Project8();
            break;
            case 9:
            current_Project = new Project9();
            break;
            case 10:
            current_Project = new Project10();
            break;
            /*
            case 11:
            current_Project = new Project11();
            break;
            case 12:
            current_Project = new Project12();
            break;
            case 13:
            current_Project = new Project13();
            break;
            case 14:
            current_Project = new Project14();
            break;
            case 15:
            current_Project = new Project15();
            break;
            case 16:
            current_Project = new Project16();
            break;
            case 17:
            current_Project = new Project17();
            break;
            case 18:
            current_Project = new Project18();
            break;
            case 19:
            current_Project = new Project19();
            break;
            case 20:
            current_Project = new Project20();
            break;
            case 21:
            current_Project = new Project21();
            break;
            case 22:
            current_Project = new Project22();
            break;
            case 23:
            current_Project = new Project23();
            break;
            case 24:
            current_Project = new Project24();
            break;
            case 25:
            current_Project = new Project25();
            break;
            case 26:
            current_Project = new Project26();
            break;
            case 27:
            current_Project = new Project27();
            break;
            case 28:
            current_Project = new Project28();
            break;
            case 29:
            current_Project = new Project29();
            break;
            case 30:
            current_Project = new Project30();
            break;
            case 31:
            current_Project = new Project31();
            break;
            case 32:
            current_Project = new Project32();
            break;
            case 33:
            current_Project = new Project33();
            break;
            case 34:
            current_Project = new Project34();
            break;
            case 35:
            current_Project = new Project35();
            break;
            case 36:
            current_Project = new Project36();
            break;
            case 37:
            current_Project = new Project37();
            break;
            case 38:
            current_Project = new Project38();
            break;
            case 39:
            current_Project = new Project39();
            break;
            case 40:
            current_Project = new Project40();
            break;
            case 41:
            current_Project = new Project41();
            break;
            case 42:
            current_Project = new Project42();
            break;
            case 43:
            current_Project = new Project43();
            break;
            case 44:
            current_Project = new Project44();
            break;
            case 45:
            current_Project = new Project45();
            break;
            case 46:
            current_Project = new Project46();
            break;
            case 47:
            current_Project = new Project47();
            break;
            case 48:
            current_Project = new Project48();
            break;
            case 49:
            current_Project = new Project49();
            break;
            case 50:
            current_Project = new Project50();
            break;
            case 61:
            current_Project = new Project61();
            break;
            case 62:
            current_Project = new Project62();
            break;
            case 63:
            current_Project = new Project63();
            break;
            case 64:
            current_Project = new Project64();
            break;
            case 65:
            current_Project = new Project65();
            break;
            case 66:
            current_Project = new Project66();
            break;
            case 67:
            current_Project = new Project67();
            break;
            case 68:
            current_Project = new Project68();
            break;
            case 69:
            current_Project = new Project69();
            break;
            case 70:
            current_Project = new Project70();
            break;
            case 71:
            current_Project = new Project71();
            break;
            case 72:
            current_Project = new Project72();
            break;
            case 73:
            current_Project = new Project73();
            break;
            case 74:
            current_Project = new Project74();
            break;
            case 75:
            current_Project = new Project75();
            break;
            case 76:
            current_Project = new Project76();
            break;
            case 77:
            current_Project = new Project77();
            break;
            case 78:
            current_Project = new Project78();
            break;
            case 79:
            current_Project = new Project79();
            break;
            case 80:
            current_Project = new Project80();
            break;
            case 81:
            current_Project = new Project81();
            break;
            case 82:
            current_Project = new Project82();
            break;
            case 83:
            current_Project = new Project83();
            break;
            case 84:
            current_Project = new Project84();
            break;
            case 85:
            current_Project = new Project85();
            break;
            case 86:
            current_Project = new Project86();
            break;
            case 87:
            current_Project = new Project87();
            break;
            case 88:
            current_Project = new Project88();
            break;
            case 89:
            current_Project = new Project89();
            break;
            case 90:
            current_Project = new Project90();
            break;
            case 91:
            current_Project = new Project91();
            break;
            case 92:
            current_Project = new Project92();
            break;
            case 93:
            current_Project = new Project93();
            break;
            case 94:
            current_Project = new Project94();
            break;
            case 95:
            current_Project = new Project95();
            break;
            case 96:
            current_Project = new Project96();
            break;
            case 97:
            current_Project = new Project97();
            break;
            case 98:
            current_Project = new Project98();
            break;
            case 99:
            current_Project = new Project99();
            break;
            case 100:
            current_Project = new Project100();
            break;
             */
            default:
            current_Project = new ProjectNotFound();
            break;
        }
        return current_Project;
    }
}
