import java.util.Map;
public class Solution {
    public void insert(TrieNode root, String string){
        TrieNode node = root;
        for(int index = 0; index < string.length(); index++){
            Character character = string.charAt(index);
            Map<Character, TrieNode> children = node.getChildren();
            if(children.containsKey(character)){
                node = children.get(character);
                node.setFrequency(node.getFrequency() + 1);
            }
            else{
                TrieNode newNode = new TrieNode();
                children.put(character, newNode);
                node = newNode;
            }
        }
    }

    public String getShortestUniquePrefix(TrieNode root, String string){
        TrieNode node = root;
        StringBuilder stringBuilder = new StringBuilder();
        for(int index = 0; index < string.length(); index++){
            Character character = string.charAt(index);
            Map<Character, TrieNode> children = node.getChildren();
            if(children.containsKey(character)) {
                node = children.get(character);
                if (node.getFrequency() == 1) {
                    stringBuilder.append(character);
                    return stringBuilder.toString();
                }
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }
}
