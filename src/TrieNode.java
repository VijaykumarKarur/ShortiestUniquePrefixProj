import java.util.Map;
import java.util.HashMap;
public class TrieNode {
    private Map<Character, TrieNode> children;
    private Integer frequency;
    public TrieNode(){
        frequency = 1;
        children = new HashMap<>();
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
}
