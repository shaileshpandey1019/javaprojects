package JavaOops;

//1
//12
//123
//1234
//12345

public class Pattern123 {
    public static void main(String[] args){
        int size =6;
        Pattern123.pattern(size);
    }
    public static void pattern(int n){

        for(int i=1; i<=n; i++){
            for (int j=1; j<=i;j++) {
//
            System.out .print(j +" ");
            }
            System.out .println();
        }
//            for (int j=1; j<6;j++){
//                if(i<j){
//
//                }
//            }
//            System.out .println(i);
//        }
    }

}
