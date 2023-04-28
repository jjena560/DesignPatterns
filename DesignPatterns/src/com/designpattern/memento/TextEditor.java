package com.designpattern.memento;

public class TextEditor {
	private String text;
    private int cursorPosition;

    public TextEditor(String text) {
        this.text = text;
        this.cursorPosition = 0;
    }

    public TextEditor() {
    	this.text = "";
    }

	public void setText(String text) {
        this.text = text;
    }

    public void setCursorPosition(int cursorPosition) {
        this.cursorPosition = cursorPosition;
    }

    public EditorMemento save() {
        return new EditorMemento(text, cursorPosition);
    }

    public void restore(EditorMemento memento) {
        this.text = memento.getText();
        this.cursorPosition = memento.getCursorPosition();
    }

    public void print() {
        System.out.println("Text: " + text + ", Cursor Position: " + cursorPosition);
    }

    public void addText(String text) {
        this.text += text;
    }

	public String getText() {
		return text;
	}

	public int getCursorPosition() {
		return this.cursorPosition;
	}
}