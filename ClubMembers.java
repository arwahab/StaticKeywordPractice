package stattic;

// Abdul Wahab

public class ClubMembers {

    public static void main(String args[]) {

        Stattic member1 = new Stattic("Megan", "Fox");
        Stattic member2 = new Stattic("Natalie", "Portman");
        Stattic member3 = new Stattic("Raveena", "Tandon");

        System.out.println();
        System.out.println(member1.getFirstName());
        System.out.println(member1.getLastName());
        System.out.println(member1.getMembers());
        System.out.println(member2.getFirstName());
        System.out.println(member2.getLastName());
        System.out.println(member2.getMembers());
        System.out.println(member3.getFirstName());
        System.out.println(member3.getLastName());
        System.out.println(member3.getMembers());
        System.out.println("Current # of members: " + Stattic.getMembers());

    }
}
