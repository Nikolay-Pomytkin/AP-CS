import java.util.*;

public class Student implements Comparable{
    private String name;
    private ArrayList<Double> grades;
    private double avg;
    public Student(String n){
        name = n;
    }
    public void addGrade(double g){
        grades.add(g);
    }
    public void setAvg(){
        double sum = 0.0;
        for(int i = 0; i < grades.size(); i++)
            sum += grades.get(i);
        avg = sum/grades.size();
    }
    public double getAvg(){
        return avg;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Double> getGrades(){
        return grades;
    }
    
    public int compareTo(Student comparestu){
        int compareName = ((Student)comparestu).getName().charAt(0);
        return this.getName().charAt(0)- compareName;
    }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}