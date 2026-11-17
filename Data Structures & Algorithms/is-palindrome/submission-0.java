class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-z0-9]", "");

        cleaned = cleaned.toLowerCase();

        for (int i = 0; i<cleaned.length(); i++){
            if (cleaned.charAt(i) != cleaned.charAt((cleaned.length()-1)- i)){
                return false;
            }
        }

        return true;
    }
}
