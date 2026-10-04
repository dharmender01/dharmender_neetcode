class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> fm = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            fm.put(nums[i], fm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> fm.get(a) - fm.get(b));

        for(int n : fm.keySet()){

            pq.add(n);

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] result = new int[k];

        int i = 0;
        while(!pq.isEmpty()){
            result[i++] = pq.poll();
        }

        return result;
    }
}
