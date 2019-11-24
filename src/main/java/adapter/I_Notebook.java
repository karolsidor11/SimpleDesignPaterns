package adapter;

public interface I_Notebook {

    void stwórzNotatke(String tytuł, String treść);

    String getNote(String tytuł);

    String usuńNotatke(String tytuł);

    String notesCatalog();
}
