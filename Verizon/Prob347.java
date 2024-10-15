//return k topmost frequent elements
class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        //hashmap to store numbers and frequencies
        //key-array element ,value-frequency
        Map<Integer,Integer> freq=new HashMap<>();

        //put key and values
        //if key doesnt exist put key and value=default value 0+1=1;
        //else get the entry of key and increment by 1;
        for(int i:nums)
        {
           freq.put(i,freq.getOrDefault(i,0)+1);
        }

        //implementation of minheap-priority queue
        //assign priority to values using frequency-lambda function
        //lesser the frequency,higher the priority of the number
     Queue<Integer> minheap=new PriorityQueue<>((n1,n2)->freq.get(n1)-freq.get(n2));
     //n1,n2 are the elements sorted using frequency

     //add each element only till size=k
     //simultaneously queue is sorted using lambda function
     for(int key:freq.keySet())
     {
        minheap.add(key);
        if(minheap.size()>k) minheap.poll();
     }
     
    //store final k elements in array
    //put elements in array in descending order of frequency
    //in queue,elements are in ascending order of frequency
    int top[]=new int[k];
    for(int i=k-1;i>=0;i--)
    {
        top[i]=minheap.poll();
    }

    return top;


    }
}
