package Undo-Redo---Java-File-IO;

public interface MyStack<T> {
    public void push(T element);
    public T pop();
    public int size();
}
