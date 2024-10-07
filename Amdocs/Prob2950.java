//number of divisible substrings
class Solution {
        public int countDivisibleSubstrings(String word) 
    {
        //put all charcters mapped to numbers in a hashmap
        Map<Character, Integer> map = new HashMap();
        map.put('a', 1);
        map.put('b', 1);
        
        map.put('c', 2);
        map.put('d', 2);
        map.put('e', 2);
        
        map.put('f', 3);
        map.put('g', 3);
        map.put('h', 3);

        map.put('i', 4);
        map.put('j', 4);
        map.put('k', 4);

        map.put('l', 5);
        map.put('m', 5);
        map.put('n', 5);

        map.put('o', 6);
        map.put('p', 6);
        map.put('q', 6);
        
        map.put('r', 7);
        map.put('s', 7);
        map.put('t', 7);

        map.put('u', 8);
        map.put('v', 8);
        map.put('w', 8);

        map.put('x', 9);
        map.put('y', 9);
        map.put('z', 9);

        int count = 0;

        //start of substring=i
        //increment start iteratively
        for (int i = 0; i < word.length(); i++)
        {
            int total = 0;
            //find all possible substrings from ith index at each iteration
            for (int j = i+1; j < word.length() + 1; j++)
            {
                //add value of each characters in current substring
                total += map.get(word.charAt(j-1));
                //if total value is divisible by length of current substring then increment count 
                if (total % (i-j) == 0)
                    count++;
            }
        }
        
        return count;
    }
}
