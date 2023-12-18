package org.book;

public enum Quality {
    NEW("It's a new book."),
    OLD("It's an old book."),
    ANCIENT("Wow! An ancient book.");

  private final String text;

    Quality(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
