package adapter;

public class NotebookAdapter implements I_Notebook, I_Notebook_v2 {

    private Notebook_v2 notebook = new Notebook_v2();

    @Override
    public void stwórzNotatke(String tytuł, String treść) {

        notebook.stwórzNotatke(tytuł, treść, null);
    }

    @Override
    public void stwórzNotatke(String tytuł, String treść, String odbiorca) {
        notebook.stwórzNotatke(tytuł, treść, odbiorca);
    }

    @Override
    public String getNote(String tytuł) {
        return notebook.getNote(tytuł);
    }

    @Override
    public String usuńNotatke(String tytuł) {
        return notebook.usuńNotatke(tytuł);
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
