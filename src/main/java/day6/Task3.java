package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Zuckerberg");
        Teacher teacher = new Teacher("Gates", "Computer science");
        Teacher teacher1 = new Teacher("Brin", "Java");

        teacher.evaluate(student);
        teacher1.evaluate(student);

    }
}
