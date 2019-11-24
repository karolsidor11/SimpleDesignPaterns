package adapter;

public class Node {

    private String tytuł;
    private String treść;

    public Node(String tytuł, String treść, String odbiorca) {
        this.tytuł = tytuł;
        this.treść = treść;
        this.odbiorca = odbiorca;
    }

    private String odbiorca;

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    public String getTreść() {
        return treść;
    }

    public void setTreść(String treść) {
        this.treść = treść;
    }

    public String getOdbiorca() {
        return odbiorca;
    }

    public void setOdbiorca(String odbiorca) {
        this.odbiorca = odbiorca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (tytuł != null ? !tytuł.equals(node.tytuł) : node.tytuł != null) return false;
        if (treść != null ? !treść.equals(node.treść) : node.treść != null) return false;
        return odbiorca != null ? odbiorca.equals(node.odbiorca) : node.odbiorca == null;
    }

    @Override
    public int hashCode() {
        int result = tytuł != null ? tytuł.hashCode() : 0;
        result = 31 * result + (treść != null ? treść.hashCode() : 0);
        result = 31 * result + (odbiorca != null ? odbiorca.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "tytuł='" + tytuł + '\'' +
                ", treść='" + treść + '\'' +
                ", odbiorca='" + odbiorca + '\'' +
                '}';
    }
}
