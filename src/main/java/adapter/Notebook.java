package adapter;

public interface Notebook {

    void createNote(String title, String content);

    String getNote(String title);

    String deleteNote(String title);

    String notesCatalog();
}
