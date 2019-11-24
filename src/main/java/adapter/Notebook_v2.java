package adapter;

import java.util.ArrayList;
import java.util.List;

public class Notebook_v2 implements I_Notebook_v2 {

    List<Node> nodeList = new ArrayList<>();

    @Override
    public void stwórzNotatke(String tytuł, String treść, String odbiorca) {
        nodeList.add(new Node(tytuł, treść, odbiorca));
    }

    @Override
    public String getNote(String tytuł) {
        return nodeList.stream()
                .filter(node -> node.getTytuł().equals(tytuł))
                .findFirst().toString();
    }

    @Override
    public String usuńNotatke(String tytuł) {
       nodeList.removeIf(node -> node.getTytuł().equals(tytuł));
       return "Usunięto  notatkę  o tytule :"+tytuł;
    }

    @Override
    public String notesList() {
        return nodeList.toString();
    }
}