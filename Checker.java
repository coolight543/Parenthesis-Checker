//Kuang Miao
//11 11 2025
//This code is to check if parenthesis is valid

//Step 1 find the last one ({[]})
//Step 2 look 1 to the right
//Step 3 if they match remove both and repeat
//Step 4 if your string is empty it's valid
public class Checker{
public static void main(String [] args){
    check("{[()]}");
}

public static void check (String s)
{
    String temp = ""; 
    int length = s.length();
    int i = 0; 
    String something = "";
    while (i<length)
    {
        if (s.substring(0,1).equals(")") || s.substring(0,1).equals("]") || s.substring(0,1).equals("}"))
        {
            System.out.println("Not Valid");
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
            i = -1;
        }
        i++;
    }
}
}
// find s the previous open bracket i-1, i, make sure it can pair up with the closing bracket i, i+1
//concatenate 0,i-1 + i+1
//reset counter (i) to zero so that it doesn't break
//repeat infinite times
