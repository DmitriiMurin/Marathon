package Day9;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Dima", "123");
        Teacher teacher = new Teacher("Lidia","Math");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }
}
