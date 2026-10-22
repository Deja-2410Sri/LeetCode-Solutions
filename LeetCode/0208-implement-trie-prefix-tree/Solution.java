class Trie {
    Trie[] children = new Trie[26];
    boolean isEnd = false;

    public Trie() {}

    public void insert(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.children[i] == null)
                node.children[i] = new Trie();
            node = node.children[i];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.children[i] == null)
                return false;
            node = node.children[i];
        }
        return node.isEnd;
    }

    public boolean startsWith(String prefix) {
        Trie node = this;
        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (node.children[i] == null)
                return false;
            node = node.children[i];
        }
        return true;
    }
}