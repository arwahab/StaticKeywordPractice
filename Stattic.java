package stattic;

public class Stattic {

    private String firstName;
    private String lastName;
    private static int members = 0;

    public Stattic(String fn, String ln) {

        firstName = fn;
        lastName = ln;
        members++;
        System.out.printf("Constrtuctor for %s %s, members in the club: %d\n", firstName, lastName, members);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;

    }

    public static int getMembers() {
        return members;
    }
    //public String setFirstName(){

    //}
    //public String setLastName(){
    //}
   // public static int setMembers(){
}
