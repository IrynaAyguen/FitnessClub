package javaproject;

public class Member {
    private char memberType;
    private int memberID;
    private String name;
    private double fees;

    public Member(char pMemberType, int pMemberID, String pName, double pFees) {
        this.memberType = pMemberType;
        this.memberID = pMemberID;
        this.name = pName;
        this.fees = pFees;
    }

    public char getMemberType() {
        return memberType;
    }

    public void setMemberType(char pMemberType) {
        this.memberType = pMemberType;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int pMemberID) {
        this.memberID = pMemberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        this.name = pName;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double pFees) {
        this.fees = pFees;
    }
    public void setMembershipPoints(int pMembershipPoints)
    {

    }

    @Override
    public String toString() {
        return  memberType + ", " + memberID + ", " + name  + ", " + fees;
    }
}
