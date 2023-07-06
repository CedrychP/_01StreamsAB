import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class KommandoZeilenTool {
  public static void main(String[] args) throws IOException {
    FileInputStream in = null;
    FileOutputStream out = null;
    int count=0;
    try {
      in = new FileInputStream("Streamtestin.txt");
      out = new FileOutputStream("Streamtestout.txt");
      int c;
      while ((c = in.read()) != -1) {
        out.write(c);count++;
      }
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
    //Muss nur in Kommandozeile reingeben für Zusatzaufgabe
    System.out.println("Zahl der Bytes "+count);
  }
}