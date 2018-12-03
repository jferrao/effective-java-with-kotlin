package io.mandrake.effective.item14;

public class Book {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title + " using Kotlin";
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
