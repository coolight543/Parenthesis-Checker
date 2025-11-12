//Kuang Miao
//11 11 2025
//This code is to check if parenthesis is valid

//Step 1 Find the first closed parenthesis
//Step 2 look 1 to the left, if the open parenthesis match the closed parenthesis, remove both parenthesis
// if null or not match, print out invalid
//Step 3 Repeat if true
//Step 4 if your string is empty it's valid
public class Checker{
String temp = ""; 
String something = "";
//precondition: The string must only contains parenthesis (), {}, []
//postcondition: it would tell you if the parenthesis is used correctly
public static void check (String s)
{
    String temp = ""; 
    String something = "";
    int length = s.length();
    for (int i = 0; i<length; i++)
    {
        if (s.substring(0,1).equals(")") || s.substring(0,1).equals("]") || s.substring(0,1).equals("}"))
        {
            System.out.println("Not Valid");
        }
        if (s.substring(0,1).equals(""))
        {
            System.out.println("Valid");
        }
        // finds the first closing bracket
        else if (s.substring(i,i+1).equals(")") || s.substring(i,i+1).equals("]") || s.substring(i,i+1).equals("}"))
        {
            temp = s.substring(i-1,i);
            something = s.substring(i,i+1);
        }
        if ((temp.equals("(") && something.equals(")")) || (temp.equals("[") && something.equals("]")) || (temp.equals("{") && something.equals("}")) )
        {
            System.out.println(s.substring(0,i-1) + s.substring(i+1));
        }
    }
    if (length != 0)
    {
        System.out.println("not Valid");
    }
    else 
    {
        System.out.println("valid");
    }
}
public static void main(String [] args){
    check("()");
}
}
// find s the previous open bracket i-1, i, make sure it can pair up with the closing bracket i, i+1
//concatenate 0,i-1 + i+1
//reset counter (i) to zero so that it doesn't break
//repeat infinite times