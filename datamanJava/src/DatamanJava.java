/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author trent
 */
public class DatamanJava {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean varified;
        double result;
        Scanner scnr = new Scanner(System.in);
        String userString;
        userString = scnr.next();
        datamanMath.mathParse(userString);
        datamanMath.mathDo();
        datamanGame.createQues();
        System.out.println(result = datamanMath.getResult());
    }
}
