package day9.Task1;

public class Teacher extends Human{
    String subjectName;
    public Teacher (String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return subjectName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This teacher's name is "+ getName());
    }
}
