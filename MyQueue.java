package Undo_Redo_Java_File_IO;

public interface MyQueue<E> {
  public void enqueue(E e);
  public E dequeue();
  public int getSize();
}
