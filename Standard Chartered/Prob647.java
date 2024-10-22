//find number of palindromic substrings
class Prob647
{
    public int countSubstrings(String s) 
    {
        int left=0,right=0,res=0;
        for(int i=0;i<s.length();i++)
        {
            //for odd length strings for index i-centre is only one-initialize left and right at same index
            res+=isPalindrome(s,i,i);

            //for even length strings for index i-centres are two-initialize left at curr index and right to next index
            res+=isPalindrome(s,i,i+1);
        }
        return res;
        
    }
    //function to calculate palindrome with starting from centre and pointers going in opposite directions
    //generally pointers start from extremes-come at centre-here its the opposite
    public int isPalindrome(String s,int left,int right)
    {
        int res=0;
        //check if left=right then only increment res and move pointers
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
                res++;
                left--;
                right++;
        }
        return res;
    }
}
