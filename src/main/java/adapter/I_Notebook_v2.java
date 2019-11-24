package adapter;

public interface I_Notebook_v2 {

    void stwórzNotatke(String tytuł, String treść, String  odbiorca);

    String getNote(String tytuł);

    String usuńNotatke(String tytuł);

    String notesList();
}
