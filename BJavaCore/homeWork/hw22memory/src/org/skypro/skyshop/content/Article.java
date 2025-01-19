package org.skypro.skyshop.content;

public final class Article implements Searchable{
    private final String title;
    private final String content;

    public Article(String title, String text) {
        this.title = title;
        this.content = text;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s", title, content);
    }

    @Override
    public String getSearchTerm() {
        return toString();
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getTitle() {
        return title;
    }
}
