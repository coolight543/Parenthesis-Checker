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
// 1 possible metho
public static void check(String s)
{
    int length = s.length()/2;
    for (int k=0; k < (s.length()); k++)
    {
        String first = s.substring(length-1, length);
        String last = s.substring(length,length+1);
        if (first.equals(last))
        {
            s.replace(first,"");
            s.replace(last,"");
        }
        else
        {
            System.out.println("Not valid");
        }
    }
}
}