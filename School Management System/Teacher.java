public class Teacher extends Person {
    private String teacherId, subject;
    private int yearsOfExperience;

    public Teacher(String teacherId, String name, String address, int age, String subject, int yearsOfExperience) {
        super(name, address, age);
        this.teacherId = teacherId;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + yearsOfExperience + " years");
    }

    public String getSubject() {
        return subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }

    public void gradeAssignment() {
        System.out.println(name + " is grading assignments for " + subject + ".");
    }
}