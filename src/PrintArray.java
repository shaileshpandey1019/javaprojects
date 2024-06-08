//Java Program to illustrate the use of declaration, instantiation
//and initialization of Java array in a single line  

public class PrintArray {
    public static void main(String[] args){
        int[] ar1 ={1,2,3,5,7,1};

//length is the property of array
        for(int i = 0; i< ar1.length; i++) {
            System.out.println(ar1[i]);
        }
    }
}
