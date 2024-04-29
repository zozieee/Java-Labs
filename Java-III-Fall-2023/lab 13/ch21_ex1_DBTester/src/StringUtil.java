/******************************************************************************
Programmer: Zoe Cope
Date: 11/24/2023
Lab 13
Instructor: Dr. Rafael Azuaje
College: San Antonio College 

*******************************************************************************/

public class StringUtil {

    public static String padWithSpaces(String s, int length) {
        if (s.length() < length) {
            StringBuilder sb = new StringBuilder(s);
            while (sb.length() < length) {
                sb.append(" ");
            }
            return sb.toString();
        } else {
            return s.substring(0, length);
        }
    }
}
