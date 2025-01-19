package org.skypro.skyshop.content;

public class SearchEngine {
    private final Searchable[] searchables;

    public SearchEngine(int size) {
        this.searchables = new Searchable[size];
    }

    public Searchable[] search(String searchTerm) {
        Searchable[] results = new Searchable[5];
        int count = 0;
        for (Searchable term : searchables) {
            if (term != null && term.getSearchTerm().toLowerCase().contains(searchTerm.toLowerCase())) {
                results[count] = term;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        return results;
    }

    public void addSearchable(Searchable searchable) {
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] == null) {
                searchables[i] = searchable;
                return;
            }
        }
        System.out.println("Невозможно добавить объект: массив заполнен!");
    }
}
