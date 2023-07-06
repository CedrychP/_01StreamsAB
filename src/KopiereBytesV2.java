import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class KopiereBytesV2 {
  public static void main(String[] args) throws IOException {
    String MyMessage = "This is my message";
    byte[] source = MyMessage.getBytes();

    //mit Strinbuffer converten
    StringWriter strw = new StringWriter();
    strw.write(MyMessage.getBytes().length);
    //Reads character array and converts it
    CharArrayReader cha;
    ByteArrayInputStream bais = new ByteArrayInputStream(source);
    int c;
    //ByteArrayInputStream
    while ((c = bais.read()) != -1) {
      System.out.print((char)c);
    }
    System.out.println();
    MyMessage = strw.toString();
    //StringWriter
    System.out.println(MyMessage);
  }
}