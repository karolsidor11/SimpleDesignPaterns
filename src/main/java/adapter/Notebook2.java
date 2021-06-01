package adapter;

public interface Notebook2 {

    void createNote(String title, String content, String recipient);

    String getNote(String title);

    String deleteNote(String title);

    String notesList();
}
