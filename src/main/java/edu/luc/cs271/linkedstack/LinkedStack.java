package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  private List<E> dataList;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO
    top = new Node<>(obj, top);
    return obj;
  }

  @Override
  public E peek() {
    // TODO
    if(isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
      return top.data;
    }
  }

  @Override
  public E pop() {
    // TODO
    if(isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
      E temp = top.data;
      top = top.next;

      return temp;
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO
    if(top == null) {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList.  Populate the ArrayList with the stack values, without deconstructing the stack!
    // TODO add any instance variable(s) required to support this
    dataList = new ArrayList<>();
    Node<E> temp;
    temp = top;

    while (top != null) {
      dataList.add(top.data);
      top = top.next;
    }
    top = temp;
    return dataList;
  }
}
