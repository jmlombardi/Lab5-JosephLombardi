package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order

    LinkedStack<String> LnkdStack = new LinkedStack<>();

    final Scanner input = new Scanner(System.in);
    while (input.hasNextLine()) {
      final String line = input.nextLine();
      LnkdStack.push(line);
    }

    while (LnkdStack.isEmpty() == false) {
      System.out.println(LnkdStack.peek());
      LnkdStack.pop();
      }




  }
}
