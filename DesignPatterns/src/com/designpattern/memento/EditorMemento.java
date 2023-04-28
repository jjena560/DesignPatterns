package com.designpattern.memento;

public class EditorMemento {
    private final String text;
    private final int cursorPosition;

    public EditorMemento(String text, int cursorPosition) {
        this.text = text;
        this.cursorPosition = cursorPosition;
    }

    public String getText() {
        return text;
    }

    public int getCursorPosition() {
        return cursorPosition;
    }
}
