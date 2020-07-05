package Java;

public class Qus15 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int len = s.length();
        String word = "";
        java.util.List<String> list = new java.util.ArrayList<>();
        //a b c d
        int temp = 0;
        while(temp<len-k+1){
            for(int i=temp;i<k+temp;i++){
                 word = word+String.valueOf(s.charAt(i));
            }
            list.add(word);
            word="";
            temp++;
        }
      // System.out.println(list);
       largest = list.get(0);
       smallest = list.get(0);
        for(String s1: list){
            if(s1.compareTo(largest)>0){
                largest = s1;
            }
            if(s1.compareTo(smallest)<0){
                smallest = s1;
            }
        }
        return smallest + "\n" + largest;
    }
    
}