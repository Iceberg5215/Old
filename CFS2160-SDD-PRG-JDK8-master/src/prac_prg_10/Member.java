package prac_prg_10;
//Based on and retrieved from
//https://github.com/TonyJenkins/cfs2160-2018-java-public/blob/master/src/cfs2160/lectures/week09/FileList.java
//https://github.com/TonyJenkins/cfs2160-2018-java-public/blob/master/src/cfs2160/lectures/week09/PhoneBook.java
import java.util.ArrayList;

public class Member {
    private ArrayList <Member> list;
    // Initialize an array for staffMembers
    public Member (ArrayList <Member> list) {
        this.list = list;
    }
    public Member() {
        this.list = new ArrayList <> ();
    }
    // Allows the addition of new members to the array
    public void addToList (Member newListing) {
        this.list.add (newListing);
    }

    private String name;
    private int contribution;

    public Member (String name) {
        this.name = name;
        this.contribution = 0;
    }

    public Member (String name, int contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getContribution () {
        return contribution;
    }

    public void setContribution (int contribution) {
        this.contribution = contribution;
    }

    public boolean contribute (int amount) {
        if (amount > 0) {
            this.contribution += amount;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString () {
        return "Member: " + this.getName () + ". Contribution: " + this.getContribution () + '.';
    }

    public static void main (String[] args) {
        // Sets the values of the variables | creates a new Member
        Member gary = new Member ("Gary", 27);
        Member tony = new Member ("Tony", 21);
        Member rubiya = new Member("Rubiya", 20);
        Member steve = new Member("Steve", 28);
        // Creates a variable called staffMembers in Member
        Member staffMembers = new Member();
        // Adds the new member records above to the list
        staffMembers.addToList(gary);
        staffMembers.addToList(tony);
        staffMembers.addToList(rubiya);
        staffMembers.addToList(steve);
        // Sets the value of totalContribution | sum contribution for all listed members
        int totalContribution = 0;
        for (Member mList : staffMembers.list) {
            System.out.println(mList);
            totalContribution += mList.contribution;
        }
        System.out.println("Total Contribution: £" + totalContribution);
        // Sets the value of costOfTurkey | calculates how many turkeys you will be able to buy
        int costOfTurkey = 20;
        int numOfTurkey = totalContribution/costOfTurkey;
        System.out.println("Number of turkeys bought: " + numOfTurkey);
    }
}
