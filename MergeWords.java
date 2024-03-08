public class MergeWords {

    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        String out = "";
        while(i < word1.length() && j<word2.length()){
            if(i==j){
                out += word1.charAt(i);
                i++;
            }else{
                out += word2.charAt(j);
                j++;
            }
        }

        while(i<word1.length()){
            out += word1.charAt(i);
            i++;
        }
        while(j < word2.length()){
            out += word2.charAt(j);
            j++;
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
    }
}
