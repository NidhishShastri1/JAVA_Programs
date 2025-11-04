package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Strig to find the number of times an word is repeated");
        String s1 = sc.nextLine();
        String[] s2=s1.split(" ");
        HashMap<String,Integer> hashMap=new LinkedHashMap<>();

        for(int i=0;i<s2.length;i++){
            hashMap.put(s2[i], hashMap.getOrDefault(s2[i],0)+1);

        }

        hashMap.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });


        char[] c1=s1.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (int i=0;i< c1.length;i++){
            map.put(c1[i],map.getOrDefault(c1[i],0)+1);

        }
        map.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });
        int[] arr={1,3,2,1,2,3,2,2,1,2,3,2,3,2,3,1,2,2,2,2,1};
        Map<Integer,Integer> map1=new LinkedHashMap<>();
        for (int i=0;i< arr.length;i++){
            map1.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        map1.forEach((k,v)->{
            System.out.println(k+" -> "+v);
        });
    }
}
