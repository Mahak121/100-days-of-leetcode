class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int gcdLength = gcd(str1.length(), str2.length());

        if ((str1 + str2).equals(str2 + str1)) {
            return str1.substring(0, gcdLength);
        } else {
            return "";
        }
    }

    private int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}