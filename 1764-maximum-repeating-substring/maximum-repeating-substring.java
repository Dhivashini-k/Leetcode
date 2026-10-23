class Solution {
    public int maxRepeating(String sequence, String word) {
        String str = "";
        int count = 0;
        while(sequence.contains(str + word)){
            str = str + word;
            count++;
        }
        return count;
    }
}