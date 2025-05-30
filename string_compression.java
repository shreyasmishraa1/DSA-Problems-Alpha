import java.util.*;
public class string_compression
{
    public static void compress(String str)
    {
        StringBuilder sb = new StringBuilder("");
        // aaabbcccdd a3b2c3d2
        for(int i =0; i < str.length(); i++)
        {
            Integer count = 1; // Created an object because we will need to convert it to string and then append to sb
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1)
            {
                count.toString();
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args)
    {
        String str = "aaabbcccdd";
        compress(str);
    }
}
