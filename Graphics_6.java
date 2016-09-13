/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Graphics_6 extends Application {

	public void drawStones(int s, int b, int st, GraphicsContext gc) {
    	gc.clearRect(0, 0, 500, 500);
    	gc.setFill(Color.BLACK);
    	gc.setFont(Font.getDefault());
    	gc.fillText("Pile 1", 10, 15);
    	for (int i = 0; i < s; i++) {
        	gc.strokeOval(10, 20 + (25 * i), 20, 20);
    	}
    	gc.fillText("Pile 2", 60, 15);
    	for (int i = 0; i < b; i++) {
        	gc.strokeOval(60, 20 + (25 * i), 20, 20);
    	}
    	gc.fillText("Pile 3", 110, 15);
    	for (int i = 0; i < st; i++) {
        	gc.strokeOval(110, 20 + (25 * i), 20, 20);
    	}

	}

	/**
 	* @param args the command line arguments
 	*/
	@Override
	public void start(Stage primaryStage) {
    	primaryStage.setTitle("DIM");
    	Group root = new Group();
    	Canvas canvas = new Canvas(500, 500);
    	GraphicsContext gc = canvas.getGraphicsContext2D();
    	drawStones(3, 5, 8, gc);
    	root.getChildren().add(canvas);
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    	//logic(gc);
    	new Thread(() -> {
        	logic(gc);
    	}).start();

	}

	public void logic(GraphicsContext gc) {
    	boolean turn = true;
    	boolean success = false;
    	int pile1 = 3, pile2 = 5, pile3 = 8;
    	Scanner scan = new Scanner(System.in);
    	while (true) {
        	System.out.println(turn);
        	if (turn) {
            	gc.clearRect(0, 0, 500, 500);
            	drawStones(pile1, pile2, pile3, gc);
            	gc.fillText("Player 1's Turn", 400, 15);
            	while (!success) {
                	System.out.println("It is player one's turn");
                	System.out.println("Pick a pile (1 (" + pile1 + ") ,2 (" + pile2 + ") ,3 (" + pile3 + ")");
                	switch (scan.nextInt()) {
                    	case 1:
                        	if (pile1 != 0) {
                            	System.out.println("Input Amount");
                            	int stupid = scan.nextInt();
                            	if (stupid <= pile1 && stupid > 0) {
                                	pile1 -= stupid;
                                	success = true;
                                	drawStones(pile1, pile2, pile3, gc);

                            	} else {
                                	System.out.println("Amount cannot be negative or more than pile");
                            	}
                        	} else {
                            	System.out.println("Pile is empty");
                        	}
                        	break;
                    	case 2:
                        	if (pile2 != 0) {
                            	System.out.println("Input Amount");
                            	int stupid = scan.nextInt();
                            	if (stupid <= pile2 && stupid > 0) {
                                	pile2 -= stupid;
                                	success = true;
                                	drawStones(pile1, pile2, pile3, gc);
                            	} else {
                                	System.out.println("Amount cannot be negative or more than pile");
                            	}
                        	} else {
                            	System.out.println("Pile is empty");
                        	}
                        	break;
                    	case 3:
                        	if (pile3 != 0) {
                            	System.out.println("Input Amount");
                            	int stupid = scan.nextInt();
                            	if (stupid <= pile3 && stupid > 0) {
                                	pile3 -= stupid;
                                	success = true;
                                	drawStones(pile1, pile2, pile3, gc);
                            	} else {
                                	System.out.println("Amount cannot be negative or more than pile");
                            	}
                        	} else {
                            	System.out.println("Pile is empty");
                        	}
                        	break;

                	}
            	}
            	if (pile1 == 0 && pile2 == 0 && pile3 == 0) {
                	System.out.println("Player 1 Lost");
                	System.exit(0);
            	}
            	turn = false;
            	success =false;

        	} else {
            	gc.clearRect(0, 0, 500, 500);
            	drawStones(pile1, pile2, pile3, gc);
            	gc.fillText("Player 2's Turn", 400, 15);
            	while (!success) {
               	 
                	System.out.println("It is player two's turn");
                	System.out.println("Pick a pile (1 (" + pile1 + ") ,2 (" + pile2 + ") ,3 (" + pile3 + ")");
                	switch (scan.nextInt()) {
                    	case 1:
                        	if (pile1 != 0) {
                            	System.out.println("Input Amount");
                            	int stupid = scan.nextInt();
                            	if (stupid <= pile1 && stupid > 0) {
                                	pile1 -= stupid;
                                	success = true;
                                	drawStones(pile1, pile2, pile3, gc);
                            	} else {
                                	System.out.println("Amount cannot be negative or more than pile");
                            	}
                        	} else {
                            	System.out.println("Pile is empty");
                        	}
                        	break;
                    	case 2:
                        	if (pile2 != 0) {
                            	System.out.println("Input Amount");
                            	int stupid = scan.nextInt();
                            	if (stupid <= pile2 && stupid > 0) {
                                	pile2 -= stupid;
                                	success = true;
                                	drawStones(pile1, pile2, pile3, gc);
                            	} else {
                                	System.out.println("Amount cannot be negative or more than pile");
                            	}
                        	} else {
                            	System.out.println("Pile is empty");
                        	}
                        	break;
                    	case 3:
                        	if (pile3 != 0) {
                            	System.out.println("Input Amount");
                            	int stupid = scan.nextInt();
                            	if (stupid <= pile3 && stupid > 0) {
                                	pile3 -= stupid;
                                	success = true;
                                	drawStones(pile1, pile2, pile3, gc);
                            	} else {
                                	System.out.println("Amount cannot be negative or more than pile");
                            	}
                        	} else {
                            	System.out.println("Pile is empty");
                        	}
                        	break;

                	}

                	if (pile1 == 0 && pile2 == 0 && pile3 == 0) {
                    	System.out.println("Player 2 Lost");
                    	System.exit(0);
                	}

            	}
            	turn = true;
            	success = false;
        	}

    	}
	}

	public static void main(String[] args) {
    	launch(args);
	}
}

