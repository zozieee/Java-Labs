import java.io.*;
import java.util.*;
import java.lang.*;

//A-Z : 65-90
//a-z : 97-122

public class ProblemSolution {
   public static String solution(String S, int K){       
        StringBuilder sb=new StringBuilder(S);
       char[] cipher=S.toCharArray();
      
           for (int i=0; i<S.length();i++){    //for each char in str
             int newPos=(((int)cipher[i])+K);
               char c=cipher[i];
               
                if(!Character.isLetter(c)&& !Character.isDigit(c) && !Character.isWhitespace(c)){
                    continue;
                }
               else{
                      if(c>='a' && c<= 'z'){    //if lower
                               //     System.out.println("called lower: "+i);
                                        int low1=(int)cipher[i];
                                        int low2= low1 - 97 + K;
                                      cipher[i]=(char)((cipher[i]+K-97)%26+97);        
                        }
                     if(c>='A' && c<='Z'){      //if upper
                               //     System.out.println("called upper");
                                 cipher[i]=(char)((cipher[i]+K-65)%26+65);
                      }
             
               }
           }//end for loop 
       
       String result=new String(cipher);
       return result;   
   }
}