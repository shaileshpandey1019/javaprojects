package Arrays;

import java.util.ArrayList;

public class ArraylistExample1 {
    public static void main(String[] args){
       ArraylistExample1.arrList();
    }
    public static void arrList(){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
//        arr.removeAll(arr);
        System.out.println(arr); //[1,2,3,4,5,6]
        int len= arr.size();
        int a=0;
        System.out.println("length of arr list is : " +len);

        if  (a<len-2 ){
            System.out.println(arr.get(2));
        }

    }
}
