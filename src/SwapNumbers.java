public class SwapNumbers {
    public static void main(String[] args){
        int a=4;
        int b=5;
        System.out.println("Value of a before:" + a);
        System.out.println("Value of b before : " + b);
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a after:" + a);
        System.out.println("Value of b after : " + b);


    }
}
