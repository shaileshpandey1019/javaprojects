package Arrays;

import java.util.Arrays;

public class CharAtString {
    public static void main(String[] args){
        int str=1234445;
        String str1="Render";
        charAtString(str);
        charAtValue(str1);
    }
    static void charAtString(int str){
        String numStr=String.valueOf(str);
        int[] arr=new int[numStr.length()];
        for (int i=0; i<numStr.length(); i++){
            arr[i]=Character.getNumericValue(numStr.charAt(i));
            System.out.println(Arrays.toString(arr));
        }

    }
    static void charAtValue(String str){
        String numStr=String.valueOf(str);
        char[] arr=new char[numStr.length()];
        for (int i=0; i<numStr.length(); i++){
            arr[i]=numStr.charAt(i);
            System.out.println(Arrays.toString(arr));

        }




    }
}
