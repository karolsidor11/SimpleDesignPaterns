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
        return nodeList.stream().filter(node -> node.getTitle().equals(title)).findFirst().toString();
    }

    @Override
    public String deleteNote(String title) {
        nodeList.removeIf(node -> node.getTitle().equals(title));
        return "Usunięto  notatkę  o tytule :" + title;
    }

    @Override
    public String notesCatalog() {
        return nodeList.toString();
    }
}
