
import java.util.*;
import java.io.*;
public class Grades {
    ArrayList<Student> students = new ArrayList();
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        File f = new File("grades.txt");
        Scanner console = new Scanner(f);
        Grades grades = new Grades();
        ArrayList<String> in = new ArrayList();
        while(console.hasNextLine())
            in.add(console.nextLine());
        for(int i = 0; i < in.size(); i++){
            String[] a = in.get(i).split(":");
            Student s = new Student(a[0]);
            in.set(i, a[1]);
        }
        for(int i = 0; i < grades.students.size(); i++){
            String[] c = in.get(i).split(",");
            for(int t = 0; t < c.length; t++)
                grades.students.get(i).addGrade(Double.parseDouble(c[t]));
            grades.students.get(i).setAvg();
        }
        bubbleSort(grades.students);
        for(int i = 0; i < grades.students.size(); i++){
            System.out.println(grades.students.get(i).getName() + ": ");
            for(int t = 0; t < grades.students.get(i).getGrades().size(); t++)
                System.out.println(grades.students.get(i).getGrades().get(t));
            System.out.println("Student average: " + grades.students.get(i).getAvg());
        }
    }
    public static void bubbleSort(ArrayList<Student> ar) {     
        int n = ar.size();
        Student temp;      
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(ar.get(j-1).getAvg() > ar.get(j).getAvg()){
                temp = ar.get(j-1);
                ar.set(j-1, ar.get(j));
                ar.set(j, temp);
                }                  
            }
        }
       
    }
}
