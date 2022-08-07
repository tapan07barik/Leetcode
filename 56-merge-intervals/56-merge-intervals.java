class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        ArrayList<ArrayList<Integer>>list=new ArrayList();
        
        
        
        int first0=intervals[0][0];
        int first1=intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            
            if(first1>=intervals[i][0]){
                
                first1=Math.max(first1,intervals[i][1]);
            }
            else{
                ArrayList<Integer>temp=new ArrayList();
                temp.add(first0);
                temp.add(first1);
                list.add(new ArrayList(temp));
                
                first0=intervals[i][0];
                first1=intervals[i][1];
            }
        }
        ArrayList<Integer>temp=new ArrayList();
                temp.add(first0);
                temp.add(first1);
                list.add(new ArrayList(temp));
        int [][]res=new int [list.size()][2];
        
        for(int i=0;i<res.length;i++){
            res[i][0]=list.get(i).get(0);
            res[i][1]=list.get(i).get(1);
        }
        
        return res;
    }
}