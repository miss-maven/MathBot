/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
/**
 *
 * @author trent
 */


public class datamanMath {
    public static boolean varification(String input){
       //<editor-fold defaultstate="collapsed" desc="Verification code">
       int i;
       char checker;
       boolean digitVarafied = true;
       for(i = 0; i < input.length();i++){
           checker = input.charAt(i);
           if (true != Character.isDigit(checker) && checker != '.'){
           digitVarafied = false;
        }
       }
       return digitVarafied;
   }
    public static List<String> userEqu = new ArrayList<>();
    public static double result;
    public static List<String>mathParse(String userString){
        int i;
        int b = -1;
        int dotCount = 0;
        int symbolCount = 0;
        char checker;
        boolean newer = false;
        boolean symbolPrev = true;
        
        String holder = "";
        
        
        for(i = 0; i < userString.length();i++){
            if ("+".equals(userString.substring(userString.length() - 1)) || 
                    "-".equals(userString.substring(userString.length() - 1)) ||
                    "/".equals(userString.substring(userString.length() - 1)) ||
                    "*".equals(userString.substring(userString.length() - 1))){
                System.out.println("Symbol at end error");
                break;
            }
            if ('+'== userString.charAt(0) || '-' == userString.charAt(0)|| '*' == userString.charAt(0)|| '/' == userString.charAt(0)/**|| ')' == userString.charAt(0)**/){
                System.out.println ("Symbol at begining error");
                break;
            }
            checker = userString.charAt(i);
            if (Character.isDigit(checker) == true || checker == '.')
            {
                if(newer == true)
                {
                    holder = "";
                    if (checker =='.'){
                        dotCount = dotCount+1;
                        if (dotCount == 2){
                            break;
                            }
                    } 
                    holder = holder + Character.toString(checker);
                    System.out.print(holder + " a ");
                    newer = false;
                    symbolPrev = false;
                    symbolCount = 0;
                }
                else{
                    holder = holder + Character.toString(checker);
                    symbolPrev = false;
                    System.out.print(holder + " b ");
                    if (checker =='.'){
                        dotCount = dotCount+1;
                            if (dotCount == 2){
                            System.out.println("to many peroids error");
                            break;
                        }
                    }
                }
            }
            else if(checker == '+'|| checker == '-' || checker == '*' || checker == '/'/** || checker == '(' || checker == ')'**/){
                if (symbolCount == 1){
                    System.out.println("symbol after symbol error");
                    break;
                }
                    symbolCount = symbolCount + 1;
                    b = b + 1;
                    if(symbolPrev == false){
                    userEqu.add(holder);
                }
                else {
                } 
                    
                    
                newer = true;
                dotCount = 0;
                holder = Character.toString(checker);
                System.out.print(holder + " c ");
                b = b + 1;
                userEqu.add(holder);
                symbolPrev = true;
                }
            else{
            System.out.println("letter or unusable symbol error");
            break;
            }
           
        }
        userEqu.add(holder);
        System.out.println(userEqu);
        return userEqu;
    }
public static void mathDo(){
    List<String> userEquat = new ArrayList<>();
    userEquat = userEqu;
    while(userEquat.size() > 1){
        int b = 0;
        double numOne;
        double numTwo;
        double mathRes;
        for (int i = userEquat.size() - 1; i>=0; i--) {
        if("*".equals(userEquat.get(i))){
            numOne = Double.parseDouble(userEquat.get(i-1));
            numTwo = Double.parseDouble(userEquat.get(i+1));
            mathRes = numOne*numTwo;
            userEquat.set(i, String.valueOf(mathRes));
            userEquat.remove(i-1);
            userEquat.remove(i);
            System.out.println("Mult " + userEquat);
        }
        }
        for (int i = userEquat.size() - 1; i>=0; i--) {
        if("/".equals(userEquat.get(i))){
            numOne = Double.parseDouble(userEquat.get(i-1));
            numTwo = Double.parseDouble(userEquat.get(i+1));
            mathRes = numOne/numTwo;
            userEquat.set(i, String.valueOf(mathRes));
            userEquat.remove(i-1);
            userEquat.remove(i);
            System.out.println("Dev " + userEquat);
        }
        }
        for (int i = userEquat.size() - 1; i>=0; i--) {
        if("+".equals(userEquat.get(i))){
            numOne = Double.parseDouble(userEquat.get(i-1));
            numTwo = Double.parseDouble(userEquat.get(i+1));
            mathRes = numOne+numTwo;
            userEquat.set(i, String.valueOf(mathRes));
            userEquat.remove(i-1);
            userEquat.remove(i);
            System.out.println("Add " + userEquat);
        }
        }
        for (int i = userEquat.size() - 1; i>=0; i--) {
        if("-".equals(userEquat.get(i))){
            numOne = Double.parseDouble(userEquat.get(i-1));
            numTwo = Double.parseDouble(userEquat.get(i+1));
            mathRes = numOne-numTwo;
            userEquat.set(i, String.valueOf(mathRes));
            userEquat.remove(i-1);
            userEquat.remove(i);
            System.out.println("Sub " + userEquat);
        }
    }
    }
    try{
    result = Double.parseDouble(userEquat.get(0));
    }
    catch(NumberFormatException e){
            System.out.println("couldnt parse.");
    }
    
    System.out.println(userEqu);
}
public static double getResult(){
return result;
}

public static void setUserEqu(List<String> newEqu){
    userEqu = newEqu;
}
}
