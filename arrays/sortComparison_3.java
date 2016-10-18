import java.util.*;
import java.io.*;

public class sortComparison_3 {


    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File f = new File("file.txt");
        Scanner console = new Scanner(f);
        
        ArrayList<String> in = new ArrayList();
        ArrayList<Student> students = new ArrayList();
        while(console.hasNextLine())
            in.add(console.nextLine());
        for(int i = 0; i < in.size(); i++){
            String[] a = in.get(i).split(":");
            Student s = new Student(a[0]);
            in.set(i, a[1]);
        }
        for(int i = 0; i < students.size(); i++){
            String[] c = in.get(i).split(",");
            for(int t = 0; t < c.length; t++)
                students.get(i).addGrade(Double.parseDouble(c[t]));
            students.get(i).setAvg();
        }
        ArrayList<Student> students2 = new ArrayList();
        for(int i = 0; i < students.size(); i++)
            students2.add(students.get(i));
        
        long start = 0; 
        long  end = 0; 
        long diff = 0;
        long diff2 = 0;
        System.out.println("Starting bubble sort...");
        
        //timing bubbleSort
        start = System.currentTimeMillis();
        bubbleSort(students);
        end = System.currentTimeMillis();
        diff = end - start;
        System.out.println("Bubble sort complete.");
        
        System.out.println("Starting collection sort...");
        //timing Collection sort
        start = System.currentTimeMillis();
        Collections.sort(students2);
        end = System.currentTimeMillis();
        diff2 = end - start;
        System.out.println("Collection sort complete.");
        
        System.out.println("Bubble sort time: " + diff + " ms");
        System.out.println("Collection sort time " + diff2 + " ms");
        
        if(diff < diff2)
            System.out.println("Bubble sort was faster");
        else
            System.out.println("Collection sort was faster");
    
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
