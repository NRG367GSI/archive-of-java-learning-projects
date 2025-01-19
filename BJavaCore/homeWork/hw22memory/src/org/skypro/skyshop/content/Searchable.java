package org.skypro.skyshop.content;

public interface Searchable {

    String searchTerm();

    String getContentType();

    String getTitle();


    default String getStringRepresentation() {
        return getTitle() + " - " + getContentType();
    }
}
