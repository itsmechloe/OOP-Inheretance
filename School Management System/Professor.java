public class Professor extends Teacher {
    private String researchArea;
    private int publications;

    public Professor(String teacherId, String name, String address, int age, String subject, int yearsOfExperience, String researchArea, int publications) {
        super(teacherId, name, address, age, subject, yearsOfExperience);
        this.researchArea = researchArea;
        this.publications = publications;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Area: " + researchArea);
        System.out.println("Publications: " + publications);
    }

    @Override
    public void teach() {
        System.out.println(name + " is teaching Advanced " + getSubject());
    }

    public void conductResearch() {
        System.out.println(name + " is conducting research in " + researchArea);
    }

    public void publishPaper() {
        publications++;
        System.out.println("New paper published! Total publications: " + publications);
    }
}