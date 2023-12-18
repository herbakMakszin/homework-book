package org.book;

public class HorrorBook extends Book{
    public HorrorBook(Quality quality, int numberOfPages) {
        super(Quality.NEW, numberOfPages);
    }

    @Override
    public String getQuality() {
        return String.valueOf(Quality.NEW.getText());
    }

    @Override
    public String getHeroMotto() {
        String text = "Muhahaha!";
        return text;
    }

    @Override
    public String getNumberOfPages() {
        String text = "I'm afraid to check.";
        return text;
    }
}
