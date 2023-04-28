package com.designpattern.memento;

import java.util.Stack;

// caretaker class
public class History {
    private Stack<EditorMemento> mementos = new Stack<>();

    public void push(EditorMemento memento) {
        mementos.push(memento);
    }

    public EditorMemento pop() {
        return mementos.pop();
    }
}
