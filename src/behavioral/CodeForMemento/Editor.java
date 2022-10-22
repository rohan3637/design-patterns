package behavioral.CodeForMemento;

public class Editor {
    
    String text;
    int cursorX;
    int cursorY;
    int fs;
    String ff;

    public void write(){
        System.out.println("Logic to write !!");
    }

    public void delete(){
        System.out.println("Logic to delete !!");
    }

    public EditorMemento getSnapshot(){
        return new EditorMemento(text, cursorX, cursorY, fs, ff);
    }

    public void restore(EditorMemento editorMemento){
        this.text = editorMemento.getText();
        this.cursorX = editorMemento.getCursorX();
        this.cursorY = editorMemento.getCursorY();
        this.fs = editorMemento.getFs();
        this.ff = editorMemento.getFf();
    }

    void printCurrentState(){
        System.out.println("------------------------------");
        System.out.println(text);
        System.out.println(cursorX);
        System.out.println(cursorY);
        System.out.println(fs);
        System.out.println(ff);
        System.out.println("--------------------------------");
    }
}
