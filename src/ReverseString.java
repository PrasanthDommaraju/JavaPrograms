public class ReverseString {

    public static void main (String[] args) {

        String s = "Java";
        //Converting string to array
        char[] arr = s.toCharArray();
        String rev = "";
        int len = s.length();

        //for loop to read the string in reverse
        for(int i=(len-1);i>=0;i--) {
//            rev=rev+s.charAt(i);
              rev=rev+arr[i];

        }

        System.out.println("Original String : "+s);

        System.out.println("Reversed String : "+rev);
    }
}