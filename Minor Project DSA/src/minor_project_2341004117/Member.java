package minor_project_2341004117;
class Member {
    private final int memberId;
    private final String lastName;
    private final  String firstName;
    private int handicap;
    private final char gender;
    private String team = "N/A";;
    private final String memberType;
    private int coach;
    private final long phone;
    private final Date joinDate;

    public Member(int memberId, String lastName, String firstName, char gender, String memberType,
           long phone, Date joinDate) {
        this.memberId = memberId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.memberType = memberType;
        this.phone = phone;
        this.joinDate = joinDate;
    }

    public Member(int memberId, String lastName, String firstName, int handicap, char gender,
           String memberType, long phone, Date joinDate) {
        this(memberId, lastName, firstName, gender, memberType, phone, joinDate);
        this.handicap = handicap;
    }

    public Member(int memberId, String lastName, String firstName, int handicap, char gender,
           String team, String memberType, long phone, Date joinDate) {
        this(memberId, lastName, firstName, handicap, gender, memberType, phone, joinDate);
        this.team = team;
    }

    public Member(int memberId, String lastName, String firstName, int handicap, char gender,
           String memberType, int coach, long phone, Date joinDate) {
        this(memberId, lastName, firstName, handicap, gender, memberType, phone, joinDate);
        this.coach = coach;
    }

    public Member(int memberId, String lastName, String firstName, int handicap, char gender,
           String team, String memberType, int coach, long phone, Date joinDate) {
        this(memberId, lastName, firstName, handicap, gender, memberType, coach, phone, joinDate);
        this.team = team;
    }

    public int getHandicapScore() {
        return handicap;
    }

    public char getGender() {
        return gender;
    }

    public String getTeam() {
        return team;
    }

    public String getMemberType() {
        return memberType;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void display() {
        System.out.println("\nMember ID: " + memberId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Handicap: " + handicap);
        System.out.println("Gender: " + gender);
        System.out.println("Team: " + team);
        System.out.println("Member Type: " + memberType);
        System.out.println("Coach: " + coach);
        System.out.println("Phone: " + phone);
        System.out.println("Joined on: " + joinDate.getDay() + "-" + joinDate.getMonth() + "-" + joinDate.getYear());
    }
}