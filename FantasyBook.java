package org.book;

public class FantasyBook extends Book {


    public FantasyBook(Quality quality, int numberOfPages) {
        super(quality, numberOfPages);
    }

    public String getNumberOfPages(double ancientCorrection) {
        String text = "";

        if (this.quality.equals(Quality.ANCIENT)) {
            setNumberOfPages((int) (numberOfPages * ancientCorrection));
            text = String.valueOf(numberOfPages);
        }else {
            text= String.valueOf(numberOfPages);
        }
        return text;
    }

    @Override
    public String getQuality() {
        return String.valueOf(Quality.ANCIENT.getText());
    }

    @Override
    public String getHeroMotto() {
        String text = "This is the final fantasy!";
        return text;
    }

}
