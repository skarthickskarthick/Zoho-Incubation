class Solution {
    public String reverseOnlyLetters(String s) {
       String res="";
       String str="";
       for(int i=0;i<s.length();i++)
       {
        if(Character.isLetter(s.charAt(i)))
        str+=String.valueOf(s.charAt(i));
       }
       System.out.println(str);
       int j=str.length();
       for(int i=0;i<s.length();i++)
       {
        if(!Character.isLetter(s.charAt(i)))
        res+=String.valueOf(s.charAt(i));
       else 
       {if(j!=0)
        res+=String.valueOf(str.charAt(--j));
       }
       }
       return res;
    }
}
