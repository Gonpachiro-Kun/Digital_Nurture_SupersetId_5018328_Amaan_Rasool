public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ramesh Singh", 1, "A");
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);
        studentController.updateView();
        studentController.setStudentName("Ramesh Singh");
        studentController.setStudentGrade("A");
        studentController.updateView();
    }
}
