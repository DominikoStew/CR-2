
public class student extends User {
    public int cohortNumber;

    public Student(String name, int age, int cohortNumber){
        super(name, age);
        this.cohortNumber=cohartNumber;
    }

    public void printStudent(){
        System.out.println("-------------");
        System.out.println("Student Information");
        System.out.println("Cohort" + cohortNumber);
        printUser();
    }
}