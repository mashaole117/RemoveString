package com.removestring;

import java.util.Scanner;

public class RemoveString {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String string = in.nextLine();
    String newString = "";

    System.out.println("Enter the character to be removed: ");
    String character = in.nextLine().charAt(0) + "";

    if (string.contains(character)) {
      String[] strings = string.split(character, 0);
      for (int i = 0; i < strings.length; i++) {
        newString = newString.concat(strings[i]);
      }
      System.out.println("Resultant string = " + newString);
    } else {
      System.out.println("Character not in string\n");
    }
  }

}