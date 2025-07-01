import java.util.*;
public class BinaryString_Recursion
{
    public static void func(int n, int lastplace, String str) // do not use StringBuilder as it will append in the same string
    {
        if(n == 0) { // consider it as there are 'n' chairs and we have to make '0' or '1' sit on them
            System.out.println(str); // if there are no chairs left now then we will print the string
            return; // do not forget return statement else program will not end
        }
//        if(lastplace == 1){
//            func(n-1,0, str+"0");
//        }
//        else{
//            func(n-1, 0, str+"0");
//            func(n-1, 1, str+"1");
//        }

        // Now, since '0' is to be appended everytime, we can write a better (optimised) code

        func(n-1,0, str+"0");
        if(lastplace == 0){
            func(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args){
        func(5,0,"");
    }
}
