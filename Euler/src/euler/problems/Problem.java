package euler.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class Problem {
  abstract public int getID();

  public String getDescription() {
    Class<? extends Problem> c = getClass();
    String txtPath = "descriptions/" + c.getSimpleName() + ".txt";

    InputStream stream = c.getResourceAsStream(txtPath);

    try (BufferedReader r = new BufferedReader(new InputStreamReader(stream))) {
      StringBuilder sb = new StringBuilder();

      String line;
      while ((line = r.readLine()) != null) {
        if (line.equals("")) {
          sb.append("\n\n");
        } else {
          sb.append(line.replaceAll("§", "\n"));
        }
      }

      return sb.toString();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  abstract public double getAnswer();

  abstract public double test(boolean verbose);
}
