package behavioral.CodeForMemento;

import java.util.Stack;

public class CareTaker {
    
    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento editorMemento){
        history.push(editorMemento);
    }

    public EditorMemento undo(){
        return history.pop();
    }
}
