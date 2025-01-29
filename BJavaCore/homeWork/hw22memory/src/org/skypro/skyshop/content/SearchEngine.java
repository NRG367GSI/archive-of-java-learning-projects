package org.skypro.skyshop.content;

import java.util.Locale;

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

    public void printSearchable() {
        for (Searchable sc : searchables) {
            if (sc != null) {
                System.out.println(sc);
            }
        }
    }

    public Searchable substringSearch(String search) throws BestResultNotFound {
        if (search == null || search.isEmpty()) {
            throw new IllegalArgumentException("Поисковая строка не может быть пустой или null");
        }

        Searchable mostRelevant = null;
        int maxCount = 0;

        for (Searchable product : searchables) {
            if (product == null) {
                continue;
            }

            String term = product.getSearchTerm().toLowerCase();
            String subString = search.toLowerCase(Locale.ROOT);
            int count = 0;
            int index = 0;

            while ((index = term.indexOf(subString, index)) != -1) {
                count++;
                index += subString.length();
            }

            if (count > maxCount) {
                maxCount = count;
                mostRelevant = product;
            }
        }

        if (mostRelevant == null) {
            throw new BestResultNotFound(search);
        }

        return mostRelevant;
    }
}
