public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int greatest=0;
        int limit=0;
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)>=greatest)
            {
            greatest=A.get(i);
            limit=i;
            }
        }
        int large=0;
        int count=0;
        for(int i=0;i<limit;i++)
        {
            if(A.get(i)>=large)
            {
                large=A.get(i);
            }
            else
            {
                count+=large-A.get(i);
            }
        }
        large=0;
        for(int i=A.size()-1;i>limit;i--)
        {
           if(A.get(i)>=large)
            {
                large=A.get(i);
            }
            else
            {
                count+=large-A.get(i);
            } 
        }
        return count;
    }
}

