package string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence to remove duplicate");
        String str =sc.nextLine();
        System.out.println(str);
        // for removing duplicate characters
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.println(set);
        // for removing dupicate Words
        Set<String> set1 = new LinkedHashSet<>();
        String[] s = str.split(" ");
        for (int i = 0;i<s.length;i++){
            set1.add(s[i]);
        }
        System.out.println(set1);

        int[] a = {1,4,1,1,4,1,2,3,1,4,1,5,1,5};
        Set<Integer> set2 = new LinkedHashSet<>();
        for(int i = 0 ;i <a.length ; i++){
            set2.add(a[i]);
        }
        System.out.println(set2);
    }
}
