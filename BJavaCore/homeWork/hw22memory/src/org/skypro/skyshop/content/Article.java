package org.skypro.skyshop.content;

public final class Article {
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
}
