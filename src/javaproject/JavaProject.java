package javaproject;
import java.util.LinkedList;

public class JavaProject {
    public static void main(String[] args) {
        String mem;

        MembershipManagement mm = new MembershipManagement();
        FileHandler fh = new FileHandler();
        LinkedList<Member> members = fh.readFile();
        int choice =mm.getChoice();

        while(choice != -1){
            switch (choice){
                case 1:
                    mem = mm.addMembers(members);
                    fh.appendFile(mem);
                    break;
                case 2:
                    mm.removeMember(members);
                    fh.overwriteFile(members);
                    break;
                case 3:
                    mm.printMemberInfo(members);
                    break;
                case 4:
                    mm.printAllMembersInfo(members);
                    break;
                case 5:
                    mm.changeMembershipPoints(members);
                    fh.overwriteFile(members);
                    break;
                default:
                    System.out.println("\nYou have selected an invalid option.\n\n");
                    break;
            }
            choice = mm.getChoice();
        }
        System.out.println("\nGood Bye");
    }
}
