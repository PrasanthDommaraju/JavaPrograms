public class ReverseString {

    public static void main (String[] args) {

        String s = "Java";
        char[] arr = s.toCharArray();
        String rev = "";
        int len = s.length();

        for(int i=(len-1);i>=0;i--) {
//            rev=rev+s.charAt(i);
              rev=rev+arr[i];

        }

        System.out.println("Original String : "+s);

        System.out.println("Reversed String : "+rev);
    }
}
