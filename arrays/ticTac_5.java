import java.util.Scanner;
public class ticTac_5 {

    /**
     * @param args the command line arguments
     */
    Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        ticTac_5 t = new ticTac_5();
        char yn;
        do{
            t.run();
            System.out.println("Do you want to play again (y or n)?");
            yn = t.console.next().charAt(0);
        }while(yn == 'y');
        System.out.println("Game shutting down...");
        
    }
    public void run(){
        String defaultBoard = "1/1|1/2|1/3"
                            + "_____"
                            + "2/1|2/2|2/3"
                            + "_____"
                            + "3/1|3/2|3/3";
        String currentBoard = setEqual(defaultBoard);
        currentBoard = replaceNum(currentBoard);
        print(currentBoard);
        for(int i = 0; i < 5; i++){
            //first person
            String x = Xturn(defaultBoard);
            String d = defaultBoard.replace(x, "x");
            defaultBoard = setEqual(d);
            currentBoard = setEqual(defaultBoard);
            currentBoard = replaceNum(currentBoard);
            print(currentBoard);
            boolean w1 = checkWin(currentBoard);
            if(w1 == true){
                System.out.println("Xs wins!");
                break;
            }
            if (i != 5){
                String o = Oturn(defaultBoard);
                String f = defaultBoard.replace(o, "o");
                defaultBoard = setEqual(f);
                currentBoard = setEqual(defaultBoard);
                currentBoard = replaceNum(currentBoard);
                print(currentBoard);
            }
            boolean w2 = checkWin(currentBoard);
            if(w1 == true){
                System.out.println("Os wins!");
                break;
            }
        }
    }    
    public String setEqual(String a){
        String b = a;
        return b;
            
    }
    public String replaceNum(String a){
        String b;
    	
    	b = a.replace("1/1", " ");
        a = b.replace("1/2", " ");
        b = a.replace("1/3", " ");
        a = b.replace("2/1", " ");
        b = a.replace("2/2", " ");
        a = b.replace("2/3", " ");
        b = a.replace("3/1", " ");
        a = b.replace("3/2", " ");
        b = a.replace("3/3", " ");
        
        return b;
    }
    public void print(String a){
        System.out.println(a.substring(0,5));
        System.out.println(a.substring(5,10));
        System.out.println(a.substring(10,15));
        System.out.println(a.substring(15,20));
        System.out.println(a.substring(20,25));
    }
    public String Xturn(String a){
    	String pos;
        int p;
        do{
        System.out.println("What row would you like to place an X in(1-3)?");
    	String r = console.next();
    	System.out.println("What column would you like to place an X in(1-3)?");
    	String c = console.next();
    	pos = r + "/" + c;
        p = getPos(pos);
        if(a.charAt(p) == 'x' || a.charAt(p) == 'o')
            System.out.println("That is an invalid move");
        }while(a.charAt(p) == 'x' || a.charAt(p) == 'o');
        return pos;        
    }
    public String Oturn(String a){
    	String pos;
        int p;
        do{
        System.out.println("What row would you like to place an O in(1-3)?");
    	String r = console.next();
    	System.out.println("What column would you like to place an O in(1-3)?");
    	String c = console.next();
    	pos = r + "/" + c;
        p = getPos(pos);
        if(a.charAt(p) == 'x' || a.charAt(p) == 'o')
            System.out.println("That is an invalid move");
        }while(a.charAt(p) == 'x' || a.charAt(p) == 'o');
        return pos; 
    }
    public boolean checkWin(String a){
        boolean win = false;
        //top row across
        if((a.charAt(0) == 'x' && a.charAt(2) == 'x' && a.charAt(4) == 'x') || (a.charAt(0) == 'o' && a.charAt(2) == 'o' && a.charAt(4) == 'o'))
            win = true;
        //middle row across
        else if((a.charAt(10) == 'x' && a.charAt(12) == 'x' && a.charAt(14) == 'x') || (a.charAt(10) == 'o' && a.charAt(12) == 'o' && a.charAt(14) == 'o'))
            win = true;
        //bottom row across
        else if((a.charAt(20) == 'x' && a.charAt(22) == 'x' && a.charAt(24) == 'x') || (a.charAt(20) == 'o' && a.charAt(22) == 'o' && a.charAt(24) == 'o'))
            win = true;
        //first column down
        else if((a.charAt(0) == 'x' && a.charAt(10) == 'x' && a.charAt(20) == 'x') || (a.charAt(0) == 'o' && a.charAt(10) == 'o' && a.charAt(20) == 'o'))
            win = true;
        //second column down
        else if((a.charAt(2) == 'x' && a.charAt(12) == 'x' && a.charAt(22) == 'x') || (a.charAt(2) == 'o' && a.charAt(12) == 'o' && a.charAt(22) == 'o'))
            win = true;
        //third column down
        else if((a.charAt(4) == 'x' && a.charAt(14) == 'x' && a.charAt(24) == 'x') || (a.charAt(4) == 'o' && a.charAt(14) == 'o' && a.charAt(24) == 'o'))
            win = true;
        //diagonal left to right
        else if((a.charAt(0) == 'x' && a.charAt(12) == 'x' && a.charAt(24) == 'x') || (a.charAt(0) == 'o' && a.charAt(12) == 'o' && a.charAt(24) == 'o'))
            win = true;
        //diagonal right to left
        else if((a.charAt(4) == 'x' && a.charAt(12) == 'x' && a.charAt(20) == 'x') || (a.charAt(4) == 'o' && a.charAt(12) == 'o' && a.charAt(20) == 'o'))
            win = true;
        return win;
    }
    public int getPos(String a){
        int x = -1;
        if(a.equals("1/1"))
            x =  0;
        else if(a.equals("1/2"))
            x =  2;
        else if(a.equals("1/3"))
            x = 4;
        else if(a.equals("2/1"))
            x = 10;
        else if(a.equals("2/2"))
            x = 12;
        else if(a.equals("2/3"))
            x = 14;
        else if(a.equals("3/1"))
            x = 20;
        else if(a.equals("3/2"))
            x = 22;
        else if(a.equals("3/3"))
            x = 24;
        return x;
    }
    
}
