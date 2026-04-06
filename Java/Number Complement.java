class Solution {
    public int findComplement(int num) 
    {
        String s = Integer.toBinaryString(num);
        String str = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            str=str+"1";
            else if(s.charAt(i)=='1')
            str=str+"0";
        }
        int sum = 0;
        for(int i=str.length()-1,j=0;i>=0;i--,j++)
        {
            if(str.charAt(i)=='1')
            {
                sum+=(int)Math.pow(2,j);
            }
        }
        return sum;
    }
}
