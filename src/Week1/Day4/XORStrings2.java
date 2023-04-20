package Week1.Day4;

import java.util.Scanner;

public class XORStrings2 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append("0");
            } else {
                sb.append("1");
            }
        }

        System.out.println(sb.toString());
    }
}
