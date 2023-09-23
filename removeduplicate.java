public class removeduplicate {
    public static void main(String[] args){
        String s="programming";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();i++){
            char ch =s.charAt(i);
            int idx=s.indexOf(ch,i+1);
                    // System.out.println(ch);
                        // break;
            if(idx==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb);


    }
    
}
