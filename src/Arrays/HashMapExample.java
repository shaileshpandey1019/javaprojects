package Arrays;

import java.util.HashMap;
import java.util.Map;

 public class HashMapExample {
    public static void main(String[] args){
        HashMapExample.hashMapexample();
    }
    public static void   hashMapexample(){
        HashMap<Integer,String> h1=new HashMap<Integer, String>();
        h1.put(1,"rahul");
        h1.put(2,"raj");
        h1.put(2,"raj22");
        h1.put(3,"raj1");
        h1.put(4,"raj2");
        System.out.println(h1);
        h1.remove(2);
        System.out.println(h1);
        h1.put(2,"rahul");
        System.out.println(h1.containsKey(2));
        System.out.println(h1.containsValue("rahul"));
        System.out.println(h1);

        for (Map.Entry<Integer,String> h: h1.entrySet()){
//            System.out.println("key: " + h.getKey()+  "  "+ " value: " +h.getValue());
            if(h.getValue().equals("rahul")){
                System.out.println("key for " +h.getValue() + " :  "+h.getKey());


            }
        }
    }
}
