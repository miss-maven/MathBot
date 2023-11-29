
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trent
 */
public class datamanGame {
    //controls the difficulty when creating a question
    public static int dif = 1;
    //controls how many numbers are in the created question
    public static int leng = 2;
            
    public static void langSet(int inLeng){
        leng = inLeng;
    }
    
    public static void difSet(int inDif){
        dif = inDif;
}
    
    public static void mathGame(){
        // where the math game code will be
        
    }
    public static void createQues(){
        int control;
        List<String> newQuestion = new ArrayList<>();
        for (int i = 0; i < leng; i++ ){
            Random rand = new Random();
            // difficulty sets the range of numbers
            newQuestion.add(String.valueOf(rand.nextInt(10^dif)));
            if (i != leng - 1){
                control =rand.nextInt(3);
                switch (control) {
                    case 3:
                        newQuestion.add("-");
                        break;
                    case 2:
                        newQuestion.add("+");
                        break;
                    case 1:
                        newQuestion.add("*");
                        break;
                    default:
                        newQuestion.add("/");
                        break;
                }
            }
        
    }
      System.out.println(newQuestion);      
        }
}
