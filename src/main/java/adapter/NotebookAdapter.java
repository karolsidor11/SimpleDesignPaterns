package adapter;

public class NotebookAdapter implements Notebook, Notebook2 {

    private NotebookImpl2 notebook = new NotebookImpl2();

    @Override
    public void createNote(String title, String content) {

        notebook.createNote(title, content, null);
    }

    @Override
    public void createNote(String title, String content, String odbiorca) {
        notebook.createNote(title, content, odbiorca);
    }

    @Override
    public String getNote(String title) {
        return notebook.getNote(title);
    }

    @Override
    public String deleteNote(String title) {
        return notebook.deleteNote(title);
    }

    @Override
    public String notesList() {
        return notebook.notesList();
    }

    @Override
    public String notesCatalog() {
        return notebook.notesList();
    }
}
