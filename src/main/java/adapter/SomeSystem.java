package adapter;

public class SomeSystem {

    public static void main(String[] args) {
        NotebookAdapter notebook =new NotebookAdapter();

        notebook.stwórzNotatke("Tytuł 1", "Pierwsza notatka");
        notebook.stwórzNotatke("Tytuł 2", "Druga notatka");
        notebook.stwórzNotatke("Tytuł 3", "Trzecia notatka");

        notebook.notesCatalog();

        notebook.getNote("a");

        notebook.usuńNotatke("Tytuł 3");
    }
}
