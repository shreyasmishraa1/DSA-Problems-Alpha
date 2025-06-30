import java.util.*;
public class Remove_Duplicates_Recursion
{
    public static void func(String str,int i,StringBuilder sb, boolean map[])
    {
        if(i == str.length() - 1) {
            System.out.println(sb);
            return;
        }
        char currchar = str.charAt(i);
        if(map[currchar - 'a'] == true){
            func(str, i+1, sb, map); // do not return as function is of void type
        }
        else{
            map[currchar - 'a'] = true;
            func(str, i+1, sb.append(currchar), map);
        }
    }
    public static void main(String[] args)
    {
        String str = "apnacollege";
        func(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
