public class RemoveAdjDuplicates {
    public static void main(String[] args) {
    /*    String str = "aabbcddeef";
        char[] c = str.toCharArray();
        for(int i = 0 ; i<c.length-1; i++){
            if (c[i]!=c[i+1]){
                System.out.print(c[i]);
            }
        }
        System.out.print(c[c.length-1]);
    */
        String str = " hi hi hi hello hello hello how r r u u";
        String[] s = str.split(" ");
        for (int i = 0; i<s.length-1;i++){
            if(!s[i].equals(s[i+1])){
                System.out.print(s[i]+" ");
            }
        }
        System.out.print(s[s.length-1]);
    }
}
