package Undo_Redo_Java_File_IO;

public interface MyStack<T> {
    public void push(T element);
    public T pop();
    public int size();
}
