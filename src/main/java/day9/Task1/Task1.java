package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Ivanov", "my group");
        Teacher teacher = new Teacher("Geits", "Computer science");
        System.out.println();
        student.printInfo();
        System.out.println();
        teacher.printInfo();


    }
}
