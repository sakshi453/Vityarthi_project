public class Member {
    private String memberId;
    private String name;

    // Constructor
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Getters
    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    // Method to display member details
    public void displayMemberInfo() {
        System.out.println("Member ID: " + memberId + " | Name: " + name);
    }
}
