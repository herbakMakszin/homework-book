package org.book;


public abstract class Book {
    public Quality quality;
    public int numberOfPages;


    public Book(Quality quality, int numberOfPages) {
        this.quality = quality;
        this.numberOfPages = numberOfPages;
    }

    public abstract String getHeroMotto();


    public String getQuality() {
        String text = String.valueOf(this.quality);
        return text;
    }

    public String getNumberOfPages() {
        String text = Integer.toString(this.numberOfPages);
        return text;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
