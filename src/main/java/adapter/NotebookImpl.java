package adapter;

import java.util.ArrayList;
import java.util.List;

public class NotebookImpl implements Notebook {

    List<Node> nodeList = new ArrayList<>();

    @Override
    public void createNote(String title, String content) {
        nodeList.add(new Node(title, content, null));
    }

    @Override
    public String getNote(String title) {
        return nodeList.stream()
                .filter(node -> node.getTitle().equals(title))
                .findFirst()
                .map(Node::toString)
                .orElse("Default note");
    }

    @Override
    public String deleteNote(String title) {
        boolean result = nodeList.removeIf(node -> node.getTitle().equals(title));
        return result ? "Note deleted : " + title : "Note not deleted";
    }

    @Override
    public String notesCatalog() {
        return nodeList.toString();
    }
}
