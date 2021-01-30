package edu.cnm.deepdive;

class Example {

  private String name = "dog";

  //below is an instance initializer. Same as a static initializer that looks like static { }
  {
    System.out.println(name);
  }

  private static int COUNT = 0;

  static {
    System.out.println("static initializer: " + COUNT);
  }

  {
    COUNT += 10;
    System.out.println("instance initializer: " + COUNT);
  }

  public Example() {
    System.out.println("Constructor");
  }
}

class Demo {
  static {
    add(2);
  }

  static void add(int number) {
    System.out.print(number + " ");
  }

  Demo() {
    add(5);
  }

  static {
    add(6);
  }

  {
    add(4);
  }
  static {
    new Demo();
  }

  {
    add(8);
  }



}

public class OrderOfInitialization {

  public static void main(String[] args) {
    Example example = new Example();
    new Demo();
  }
}
