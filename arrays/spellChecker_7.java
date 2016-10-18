import java.util.*;
import java.io.*;

public class spellChecker_7 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String[] arrayofstrings = new String[20];
        File inp = new File("input.txt");
        Scanner spell = new Scanner(inp);
        char[] temp = new char[0];
        int cCounter = 0;
        int mcCounter = 0;
        String closestmatch = "";
       
        for(int i = 0; i < 20; i++){
            arrayofstrings[i] = spell.nextLine();            
        }
        
        System.out.println("Enter a word to check.");
        String input = scan.nextLine();
        
        //converts string to char array
        char[] inputarray = new char[input.length()];
        for(int z = 0; z < input.length(); z++){
            inputarray[z] = input.charAt(z);
        }
        
        for(int a = 0; a < 20; a++){
            //if string is correct
            if(input.equals(arrayofstrings[a])){
                System.out.println("Your spelling is correct!");
                closestmatch = arrayofstrings[a];
            }
            //if spelling is not correct
            else{
                temp = new char[arrayofstrings[a].length()]; 
                //makes .txt string a char array
                for(int z = 0; z < arrayofstrings[a].length(); z++){
                    temp[z] = arrayofstrings[a].charAt(z); 
                    
                }
                if(temp.length >= inputarray.length){
                    for(int i = 0; i < inputarray.length; i++){                     
                        if(inputarray[i] == temp[i]){  
                            cCounter++;
                        }                        
                    }                  
                }
                else if(temp.length < inputarray.length){
                    for(int i = 0; i < temp.length; i++){                     
                        if(inputarray[i] == temp[i]){   
                            cCounter++;
                        }                        
                    }   
                }
                if(cCounter > mcCounter){
                    mcCounter = cCounter;
                    closestmatch = arrayofstrings[a];
                    cCounter = 0;                    
                }
                else if(cCounter < mcCounter){
                    cCounter = 0;
                }
                
            }
            
        }
        System.out.println("Did you mean: " + closestmatch + "?");
        String yn = scan.next();
        if(yn.equalsIgnoreCase("yes"))
            System.out.println("Word changed to " + closestmatch);
        else
            System.out.println("Word not found");
        
    }
    
}
