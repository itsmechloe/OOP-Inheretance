public class Main {
	public static void main(String[] args) {
		Professor professor = new Professor(
			"T1001",
			"Dr. Smith",
			"123 University Ave",
			45,
			"Computer Science",
			15,
			"Artificial Intelligence",
			28
		);

		System.out.println("=== Person Information ===");
		professor.introduce();
		System.out.println();
		professor.displayInfo();
		System.out.println();
		professor.teach();
		professor.conductResearch();
		professor.publishPaper();
	}
}
