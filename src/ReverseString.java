public class ReverseString {
    public static void main(String[] args){
        String x="HelloWorld";
        char[] originalArray =x.toCharArray();
        System.out.println(originalArray);
        int length =x.length();
        System.out.println(length);

        for (int i=0; i<length/2; i++){
            char temp=originalArray[i];

            originalArray[i]=originalArray[length-1-i];
            originalArray[length - 1 - i] = temp;

        }
        String reversestring =new String(originalArray);
        System.out.println(reversestring);

    }
}
