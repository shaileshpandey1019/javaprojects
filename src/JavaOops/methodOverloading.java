package JavaOops;

public class methodOverloading {
    static double sum (double  a, double b){
        return a+b;
    }
    static double sum (double  a, int b){
        return a+b;
    }
    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        System.out.println(methodOverloading.sum(10,10,30));
        System.out.println(methodOverloading.sum(10,10));
        System.out.println(methodOverloading.sum(10.304,10.55));
        System.out.println(methodOverloading.sum(10.304,10));
    }
}
