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
    }
}
