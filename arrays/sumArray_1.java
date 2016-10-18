import java.util.ArrayList;
import java.util.Scanner;

// Nikolay Pomytkin
// 8-29-2016

import java.util.*;

public class sumArray_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Double> nums = new ArrayList();
        String[] a = console.next().split(",");
        double[] b = new double[20];
        double[] c = new double[20];
        for(int i = 0; i < a.length; i++)
            nums.add(Double.parseDouble(a[i]));
        int less = 20-a.length;
        for(int i = 0; i < less; i++){
            nums.add(r.nextDouble() + (r.nextInt(99)/10.0));
        }
        int[] sums = new int[5];
        for(int i = 0; i < 5; i++)
            sums[i] = 0;
        int t = 0;
        for(int i = 0; i < 20; i++){
            if(i % 4 == 0 && i != 0){
                System.out.println(sums[t]);
                t++;
            }
            sums[t] += nums.get(i);
        }
        double sig = 0.0;
        for(int i = 0; i < 5; i++)
            sig += sums[i];
        double avg = sig/5.0;
        System.out.println(avg);
        
    }    
}
