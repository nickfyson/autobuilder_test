package hello;

import java.io.File;
import java.io.IOException;

public class HelloWorld {
  public static void main(String[] args) throws IOException {

      int i = 2000000000;
      long j = i*i; // causes overflow

      System.out.println("overflowed result = " + j);

      // user-controlled int that can potentially overflow
      final long doubleNumFiles = new File(".").list().length * 2;
      System.out.println("Double number of files = " + doubleNumFiles);
  }
}
