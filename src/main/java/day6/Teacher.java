package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    Random ran = new Random();

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }

    public void evaluate(Student student) {
        int gradeInt = ran.nextInt(4) + 2;
        String grade = null;

        switch (gradeInt) {
            case 2:
                grade = "Неудовлетворительно";
                break;
            case 3:
                grade = "Удовлетворительно";
                break;
            case 4:
                grade = "Хорошо";
                break;
            case 5:
                grade = "Отлично";
            default:
        }


        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + grade);

    }
}
