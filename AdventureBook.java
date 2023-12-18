package org.book;

public class AdventureBook extends Book {
    public AdventureBook(Quality quality, int numberOfPages) {
        super(quality, numberOfPages);
    }

    @Override
    public String getHeroMotto() {
        String text = "Adventure is out there.";
        return text;
    }

    @Override
    public String getNumberOfPages() {
        return super.getNumberOfPages();
    }

    @Override
    public String getQuality() {
        String text = "But who cares? Let's read it!";
        return String.valueOf(Quality.OLD.getText() + " " + text);

    }
}
