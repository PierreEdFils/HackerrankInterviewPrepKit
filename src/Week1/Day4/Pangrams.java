package Week1.Day4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

class Result {

/*
 * Complete the 'pangrams' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

public static String pangrams(String s) {
        // Write your code here
    Set<Character> letters = new HashSet<>();
    for (char c : s.toCharArray()) {
        if (Character.isLetter(c)) {
            letters.add(Character.toLowerCase(c));
        }
    }
    return letters.size() == 26 ? "pangram" : "not pangram";
        }

        }
public class Pangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
