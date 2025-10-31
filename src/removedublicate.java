import java.util.Set;
import java.util.TreeSet;

public class removedublicate {
    public static void main(String[] args) {
        String str = "aaabbbbaaaaccccddddeeeegffgsysgs";
        System.out.println(str);
        Set<Character> s = new TreeSet<Character>();
        for (int i = 0 ; i <str.length();i++){
            s.add(str.charAt(i));
        }
        System.out.println(s);
    }
}
