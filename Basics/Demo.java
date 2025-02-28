package Basics;

import java.util.*;


public class Demo {
  public static void main(String args[]) {

    List<String> names = List.of("Bhuvan", "Keerthi", "Nani", "Meenu");

    // To find if there is name with "M" in it.

    String name = names.stream()
    // For char insensitive check 
    .filter( n -> n.toLowerCase().contains("M".toLowerCase()))
    .findFirst()
    .orElse("Not Found any name with 'M'");
    
    System.out.println(name);
    
  }
}
