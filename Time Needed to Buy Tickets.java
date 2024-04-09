class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sec = 0;
        while (tickets[k] > 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0 && tickets[k] > 0) {
                    tickets[i]--; 
                    sec++;
                    if (i == k && tickets[k] == 0) {
                        return sec;
                    }
                }
            }
        }
        return sec;
    }
}
