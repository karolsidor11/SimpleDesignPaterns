package adapter;

public class SomeSystem {

    public static void main(String[] args) {
        NotebookAdapter notebook = new NotebookAdapter();

        notebook.createNote("Title 1", "First note");
        notebook.createNote("Title 2", "Second note");
        notebook.createNote("Title 3", "Third note");

        notebook.notesCatalog();
        notebook.getNote("First note");
        notebook.deleteNote("Title 3");
    }
}
