class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int first=func(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            int temp=func(s.charAt(i));
            if(first<temp)
            sum-=first;
            else
            sum+=first;
            first=temp;
        }
        sum+=first;
        return sum;
    }
    int func(char c)
    {
        switch(c)
        {
            case 'I':
            return 1;
            case 'V':
            return 5;
            case 'X':
            return 10;
            case 'L':
            return 50;
            case 'C':
            return 100;
            case 'D':
            return 500;
            case 'M':
            return 1000;
            default:
            return 0;
        }
    }
}

