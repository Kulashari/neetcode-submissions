class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left_index = 0;
        int right_index = numbers.length-1;

        while (numbers[left_index] + numbers[right_index] != target) {       
            if (numbers[left_index] + numbers[right_index] > target){
                right_index-=1;
            }
            else if (numbers[left_index] + numbers[right_index] < target){
                left_index+=1;
            }
        }
        result[0] = left_index+1;
        result[1] = right_index+1;
        return result;
    }
}