package com.designpattern.memento;

public class TestMemento {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		// caretaker
		History history = new History();

		// Set the initial state of the editor
		editor.setText("Hello World!");
		editor.setCursorPosition(5);

		// Save the editor's state to history
		history.push(editor.save());

		// Make some changes to the editor's text
		editor.addText(" I am using the Memento pattern.");

		// Save the editor's state to history
		history.push(editor.save());

		// Make more changes to the editor's text
		editor.addText(" This pattern is very useful.");
		System.out.println(editor.getCursorPosition());
		history.push(editor.save());
		// Restore the previous state of the editor from history
		editor.restore(history.pop());
		editor.restore(history.pop());
		editor.restore(history.pop());

		System.out.println(editor.getText()); // Output: "Hello World! I am using the Memento pattern."
	}
}