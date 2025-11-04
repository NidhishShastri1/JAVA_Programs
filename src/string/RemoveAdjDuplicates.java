package string;

public class RemoveAdjDuplicates {
    public static void main(String[] args) {
       String str = "aabbcddeef";
        char[] c = str.toCharArray();
        for(int i = 0 ; i<c.length-1; i++){
            if (c[i]!=c[i+1]){
                System.out.print(c[i]);
            }
        }
        System.out.print(c[c.length-1]);
        System.out.println("");

        String str1 = " hi hi hi hello hello hello how r r u u";
        String[] s = str1.split(" ");
        for (int i = 0; i<s.length-1;i++){
            if(!s[i].equals(s[i+1])){
                System.out.print(s[i]+" ");
            }
        }
        System.out.print(s[s.length-1]);
        System.out.println("");
        int[] a = {1,1,1,12,2,2,4,5,6,6,7};
        for(int i = 0 ; i<a.length-1; i++){
            if (a[i]!=a[i+1]){
                System.out.print(a[i] + " ");
            }
        }
        System.out.print(a[a.length-1]);

    }
}
