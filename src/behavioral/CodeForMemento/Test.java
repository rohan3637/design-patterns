package behavioral.CodeForMemento;

public class Test {
    
    public static void main(String[] args){

        Editor editor = new Editor();
        CareTaker careTaker = new CareTaker();

        editor.text = "Hello";
        editor.cursorX = 10;
        editor.cursorY = 20;
        editor.fs = 20;
        editor.ff = "Times New Roman";
        editor.printCurrentState();

        EditorMemento editorMemento1 = editor.getSnapshot();
        careTaker.save(editorMemento1);

        editor.text += " World";
        editor.cursorX = 30;
        editor.printCurrentState();

        EditorMemento editorMemento2 = editor.getSnapshot();
        careTaker.save(editorMemento2);

        editor.fs = 26;
        editor.ff = "Comic Sans MS";
        editor.printCurrentState();

        EditorMemento editorMemento3 = editor.getSnapshot();
        careTaker.save(editorMemento3);  
        
        editor.text += " , hope all is well !!";
        editor.printCurrentState();

        editor.restore(careTaker.undo());
        editor.printCurrentState();

        editor.restore(careTaker.undo());
        editor.printCurrentState();
        
        editor.restore(careTaker.undo());
        editor.printCurrentState();
    }
}
