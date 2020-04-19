package adapter;

public class SomeSystem {

    public static void main(String[] args) {
        NotebookAdapter notebook =new NotebookAdapter();

        notebook.createNote("Tytuł 1", "Pierwsza notatka");
        notebook.createNote("Tytuł 2", "Druga notatka");
        notebook.createNote("Tytuł 3", "Trzecia notatka");

        notebook.notesCatalog();

        notebook.getNote("a");

        notebook.deleteNote("Tytuł 3");
    }
}
