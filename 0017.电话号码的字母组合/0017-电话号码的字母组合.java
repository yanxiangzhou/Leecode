class Solution {
    private String digits;
    private List<String> res;
    private StringBuilder str;
    private String[] numbers;
    public List<String> letterCombinations(String digits) {
        //backtracking
        this.digits = digits;
        res = new ArrayList<>();
        if(digits.length() == 0) {
            return res;
        }
        numbers = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        str = new StringBuilder();
        dfs(0);
        
        return res;
    }

    private void dfs(int curLen) {
        if(curLen == digits.length()) {
            res.add(str.toString());
            return;
        }
        for(char ch: numbers[digits.charAt(curLen) - '2'].toCharArray()) {
            str.append(ch);
            dfs(curLen + 1);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
