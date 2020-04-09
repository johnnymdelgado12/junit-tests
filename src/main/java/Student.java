
import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){

        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrade(){
        return grades;
    }

    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

}
