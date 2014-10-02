package rot13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author andrewjohnson
 */
public class CipherKey {

    List<String> alpha = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
    List<String> alphaRev = Arrays.asList("N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M");

    public String codeDecode(String s) {
        //System.out.println(s);

        for (int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            //System.out.println(ch);
            int x = alpha.indexOf("" + ch);
            if (x == -1) {
                System.out.print(ch);
            }
            else {
            //System.out.println(x);
            String y = alphaRev.get(x);
            System.out.print(y);
            }
        }

        return null;
    }

    public static String readInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter message to be encoded or decoded");

        String s = br.readLine().toUpperCase();
        //System.out.println(s);

        return s;

    }
}
