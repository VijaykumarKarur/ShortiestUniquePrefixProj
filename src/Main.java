public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TrieNode root = new TrieNode();
        String[] arrString = new String[5];
        arrString[0] = "abcd";
        arrString[1] = "ABCD";
        arrString[2] = "apple";
        arrString[3] = "$";
        arrString[4] = "ABC";

        for(int index = 0; index < arrString.length; index++){
            solution.insert(root, arrString[index]);
        }

        for(int index = 0; index < arrString.length; index++){
            System.out.println(solution.getShortestUniquePrefix(root, arrString[index]));
        }
    }
}
