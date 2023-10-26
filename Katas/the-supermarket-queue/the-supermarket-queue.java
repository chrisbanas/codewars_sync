import java.util.Arrays;
import java.util.*;

public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
      
        if (customers.length == 0) {
            return 0;
        }

        if (n <= 0) {
            return -1; // Invalid input
        }

        PriorityQueue<Integer> tills = new PriorityQueue<>(n);

        // Initialize the priority queue with the first n customers
        for (int i = 0; i < n && i < customers.length; i++) {
            tills.offer(customers[i]);
        }

        // Process the remaining customers
        for (int i = n; i < customers.length; i++) {
            int minTimeTill = tills.poll();
            minTimeTill += customers[i];
            tills.offer(minTimeTill);
        }

        // Find the maximum total time among tills
        int maxTime = Integer.MIN_VALUE;
      
        for (int time : tills) {
            maxTime = Math.max(maxTime, time);
        }

        return maxTime;
      
    }
    
}