package org.skypro.skyshop.content;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class SearchEngine {
    private final List <Searchable> searchables;

    public SearchEngine() {
        this.searchables = new LinkedList<>();
    }

    public List <Searchable> search(String searchTerm) {
        List <Searchable> results = new LinkedList<Searchable>();
        for (Searchable term : searchables) {
            if (term != null && term.getSearchTerm().toLowerCase().contains(searchTerm.toLowerCase())) {
                results.add(term);
            }
        }
        return results;
    }

    public void addSearchable(Searchable searchable) {
        searchables.add(searchable);
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
