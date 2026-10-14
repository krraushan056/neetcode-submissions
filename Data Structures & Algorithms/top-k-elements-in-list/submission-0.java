class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        for(int n:nums){
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        
        for(Map.Entry<Integer,Integer> entry: frequencyMap.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        int [] topKFrequent = new int[k];
        int index=0;
        while(!minHeap.isEmpty()){
            topKFrequent[index++]= minHeap.poll().getKey();
        }

        return topKFrequent;
        
    }
}
