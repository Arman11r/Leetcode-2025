

import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }

        return sol(list);
    }

    public int sol(List<Integer> list) {
        while (list.size() > 1) {
            Collections.sort(list, Collections.reverseOrder());

            int x = list.get(0); 
            int y = list.get(1); 

            list.remove(0); 
            list.remove(0); 
            if (x != y) {
                list.add(x - y); 
            }
        }

        if(list.size() == 0){
            return 0;
        }
        return list.get(0);
        
    }
}
